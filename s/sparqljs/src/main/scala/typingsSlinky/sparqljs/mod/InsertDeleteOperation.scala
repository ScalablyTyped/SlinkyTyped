package typingsSlinky.sparqljs.mod

import typingsSlinky.sparqljs.sparqljsStrings.delete
import typingsSlinky.sparqljs.sparqljsStrings.deletewhere
import typingsSlinky.sparqljs.sparqljsStrings.insert
import typingsSlinky.sparqljs.sparqljsStrings.insertdelete
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InsertDeleteOperation extends UpdateOperation {
  
  var delete: js.UndefOr[js.Array[Quads]] = js.native
  
  var graph: js.UndefOr[IriTerm] = js.native
  
  var insert: js.UndefOr[js.Array[Quads]] = js.native
  
  var updateType: insert | delete | deletewhere | insertdelete = js.native
  
  var where: js.UndefOr[js.Array[Pattern]] = js.native
}
object InsertDeleteOperation {
  
  @scala.inline
  def apply(updateType: insert | delete | deletewhere | insertdelete): InsertDeleteOperation = {
    val __obj = js.Dynamic.literal(updateType = updateType.asInstanceOf[js.Any])
    __obj.asInstanceOf[InsertDeleteOperation]
  }
  
  @scala.inline
  implicit class InsertDeleteOperationMutableBuilder[Self <: InsertDeleteOperation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDelete(value: js.Array[Quads]): Self = StObject.set(x, "delete", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeleteUndefined: Self = StObject.set(x, "delete", js.undefined)
    
    @scala.inline
    def setDeleteVarargs(value: Quads*): Self = StObject.set(x, "delete", js.Array(value :_*))
    
    @scala.inline
    def setGraph(value: IriTerm): Self = StObject.set(x, "graph", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGraphUndefined: Self = StObject.set(x, "graph", js.undefined)
    
    @scala.inline
    def setInsert(value: js.Array[Quads]): Self = StObject.set(x, "insert", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInsertUndefined: Self = StObject.set(x, "insert", js.undefined)
    
    @scala.inline
    def setInsertVarargs(value: Quads*): Self = StObject.set(x, "insert", js.Array(value :_*))
    
    @scala.inline
    def setUpdateType(value: insert | delete | deletewhere | insertdelete): Self = StObject.set(x, "updateType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWhere(value: js.Array[Pattern]): Self = StObject.set(x, "where", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWhereUndefined: Self = StObject.set(x, "where", js.undefined)
    
    @scala.inline
    def setWhereVarargs(value: Pattern*): Self = StObject.set(x, "where", js.Array(value :_*))
  }
}
