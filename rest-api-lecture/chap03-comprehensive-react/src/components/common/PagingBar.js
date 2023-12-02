function PagingBar({ pageInfo, setCurrentPage }) {

    // const pageNumber = [...Array(pageInfo.endPage - pageInfo.startPage + 1).keys()]
    //                                 .map(key => key + pageInfo.startPage);

    const pageNumber = [];

    for(let i = pageInfo.startPage; i <= pageInfo.endPage; i++) {
        pageNumber.push(i);
    }


    return (
        <ul className="paging-ul">
            <li>
                <button
                    className="paging-btn"
                    onClick={ () => setCurrentPage(pageInfo.currentPage - 1) }
                    disabled={ pageInfo.currentPage <= 1 }
                >
                    &lt;
                </button>
            </li>
            {
                pageNumber.map(num => (
                    <li key={num}>
                        <button
                            className="paging-btn"
                            style={ pageInfo.currentPage === num ? { backgroundColor : 'orange'} : null }
                            onClick={ () => setCurrentPage(num) }
                            disabled={ pageInfo.currentPage === num }
                        >
                            {num}
                        </button>
                    </li>
                ))
            }
            <li>
                <button
                    className="paging-btn"
                    onClick={ () => setCurrentPage(pageInfo.currentPage + 1) }
                    disabled={ pageInfo.currentPage >= pageInfo.maxPage }
                >
                    &gt;
                </button>
            </li>
        </ul>
    );
}

export default PagingBar;