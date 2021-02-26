package typingsSlinky.winjs.WinJS.UI

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Contains items that were requested from an IListDataAdapter and provides some information about those items.
  **/
@js.native
trait IFetchResult[T] extends StObject {
  
  //#region Properties
  /**
    * Gets or sets the index of the requested item in the IListDataAdapter object's data source.
    **/
  var absoluteIndex: Double = js.native
  
  /**
    * Gets or sets a value that indicates whether this IFetchResult contains the last items at the end of the IListDataAdapter object's data source.
    **/
  var atEnd: Boolean = js.native
  
  /**
    * Gets or sets a value that indicates whether this IFetchResult contains the first items at the beginning of the IListDataAdapter object's data source.
    **/
  var atStart: Boolean = js.native
  
  /**
    * Gets or sets the items returned by the fetch operation.
    **/
  var items: js.Array[T] = js.native
  
  /**
    * Gets or sets the location of the requested item within the items array.
    **/
  var offset: Double = js.native
  
  /**
    * Gets or sets the number of items in the IListDataAdapter object's underlying data source.
    **/
  var totalCount: Double = js.native
}
object IFetchResult {
  
  @scala.inline
  def apply[T](
    absoluteIndex: Double,
    atEnd: Boolean,
    atStart: Boolean,
    items: js.Array[T],
    offset: Double,
    totalCount: Double
  ): IFetchResult[T] = {
    val __obj = js.Dynamic.literal(absoluteIndex = absoluteIndex.asInstanceOf[js.Any], atEnd = atEnd.asInstanceOf[js.Any], atStart = atStart.asInstanceOf[js.Any], items = items.asInstanceOf[js.Any], offset = offset.asInstanceOf[js.Any], totalCount = totalCount.asInstanceOf[js.Any])
    __obj.asInstanceOf[IFetchResult[T]]
  }
  
  @scala.inline
  implicit class IFetchResultMutableBuilder[Self <: IFetchResult[_], T] (val x: Self with IFetchResult[T]) extends AnyVal {
    
    @scala.inline
    def setAbsoluteIndex(value: Double): Self = StObject.set(x, "absoluteIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAtEnd(value: Boolean): Self = StObject.set(x, "atEnd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAtStart(value: Boolean): Self = StObject.set(x, "atStart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItems(value: js.Array[T]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemsVarargs(value: T*): Self = StObject.set(x, "items", js.Array(value :_*))
    
    @scala.inline
    def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTotalCount(value: Double): Self = StObject.set(x, "totalCount", value.asInstanceOf[js.Any])
  }
}
