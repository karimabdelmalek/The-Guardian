package karimabdelmalek.theguardiancallbacks.DataClasses;

import java.util.ArrayList;

/**
 * Created by karimabdelmalek on 9/27/16.
 */

public class GuardianResponse
{
    public String status;
    public String userTier;
    public int total;
    public int startIndex;
    public int pageSize;
    public int currentPage;
    public int pages;
    public String orderBy;
    public ArrayList<ResultItem> results;
}
