package typingsSlinky.vsoNodeApi.gitInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GitQueryCommitsCriteria extends StObject {
  
  /**
    * Number of entries to skip
    */
  @JSName("$skip")
  var $skip: Double = js.native
  
  /**
    * Maximum number of entries to retrieve
    */
  @JSName("$top")
  var $top: Double = js.native
  
  /**
    * Alias or display name of the author
    */
  var author: String = js.native
  
  /**
    * If provided, the earliest commit in the graph to search
    */
  var compareVersion: GitVersionDescriptor = js.native
  
  /**
    * If true, don't include delete history entries
    */
  var excludeDeletes: Boolean = js.native
  
  /**
    * If provided, a lower bound for filtering commits alphabetically
    */
  var fromCommitId: String = js.native
  
  /**
    * If provided, only include history entries created after this date (string)
    */
  var fromDate: String = js.native
  
  /**
    * What Git history mode should be used. This only applies to the search criteria when Ids = null.
    */
  var historyMode: GitHistoryMode = js.native
  
  /**
    * If provided, specifies the exact commit ids of the commits to fetch. May not be combined with other parameters.
    */
  var ids: js.Array[String] = js.native
  
  /**
    * Whether to include the _links field on the shallow references
    */
  var includeLinks: Boolean = js.native
  
  /**
    * Whether to include linked work items
    */
  var includeWorkItems: Boolean = js.native
  
  /**
    * Path of item to search under
    */
  var itemPath: String = js.native
  
  /**
    * If provided, identifies the commit or branch to search
    */
  var itemVersion: GitVersionDescriptor = js.native
  
  /**
    * If provided, an upper bound for filtering commits alphabetically
    */
  var toCommitId: String = js.native
  
  /**
    * If provided, only include history entries created before this date (string)
    */
  var toDate: String = js.native
  
  /**
    * Alias or display name of the committer
    */
  var user: String = js.native
}
object GitQueryCommitsCriteria {
  
  @scala.inline
  def apply(
    $skip: Double,
    $top: Double,
    author: String,
    compareVersion: GitVersionDescriptor,
    excludeDeletes: Boolean,
    fromCommitId: String,
    fromDate: String,
    historyMode: GitHistoryMode,
    ids: js.Array[String],
    includeLinks: Boolean,
    includeWorkItems: Boolean,
    itemPath: String,
    itemVersion: GitVersionDescriptor,
    toCommitId: String,
    toDate: String,
    user: String
  ): GitQueryCommitsCriteria = {
    val __obj = js.Dynamic.literal($skip = $skip.asInstanceOf[js.Any], $top = $top.asInstanceOf[js.Any], author = author.asInstanceOf[js.Any], compareVersion = compareVersion.asInstanceOf[js.Any], excludeDeletes = excludeDeletes.asInstanceOf[js.Any], fromCommitId = fromCommitId.asInstanceOf[js.Any], fromDate = fromDate.asInstanceOf[js.Any], historyMode = historyMode.asInstanceOf[js.Any], ids = ids.asInstanceOf[js.Any], includeLinks = includeLinks.asInstanceOf[js.Any], includeWorkItems = includeWorkItems.asInstanceOf[js.Any], itemPath = itemPath.asInstanceOf[js.Any], itemVersion = itemVersion.asInstanceOf[js.Any], toCommitId = toCommitId.asInstanceOf[js.Any], toDate = toDate.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
    __obj.asInstanceOf[GitQueryCommitsCriteria]
  }
  
  @scala.inline
  implicit class GitQueryCommitsCriteriaMutableBuilder[Self <: GitQueryCommitsCriteria] (val x: Self) extends AnyVal {
    
    @scala.inline
    def set$skip(value: Double): Self = StObject.set(x, "$skip", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set$top(value: Double): Self = StObject.set(x, "$top", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthor(value: String): Self = StObject.set(x, "author", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCompareVersion(value: GitVersionDescriptor): Self = StObject.set(x, "compareVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExcludeDeletes(value: Boolean): Self = StObject.set(x, "excludeDeletes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFromCommitId(value: String): Self = StObject.set(x, "fromCommitId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFromDate(value: String): Self = StObject.set(x, "fromDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHistoryMode(value: GitHistoryMode): Self = StObject.set(x, "historyMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIds(value: js.Array[String]): Self = StObject.set(x, "ids", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdsVarargs(value: String*): Self = StObject.set(x, "ids", js.Array(value :_*))
    
    @scala.inline
    def setIncludeLinks(value: Boolean): Self = StObject.set(x, "includeLinks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIncludeWorkItems(value: Boolean): Self = StObject.set(x, "includeWorkItems", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemPath(value: String): Self = StObject.set(x, "itemPath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemVersion(value: GitVersionDescriptor): Self = StObject.set(x, "itemVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setToCommitId(value: String): Self = StObject.set(x, "toCommitId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setToDate(value: String): Self = StObject.set(x, "toDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUser(value: String): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
  }
}
