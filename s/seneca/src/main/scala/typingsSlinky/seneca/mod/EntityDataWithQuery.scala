package typingsSlinky.seneca.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EntityDataWithQuery
  extends /* plugin_name */ StringDictionary[js.Any] {
  
  var id: js.UndefOr[String] = js.native
  
  @JSName("sort$")
  var sort$: js.UndefOr[js.Any] = js.native
}
object EntityDataWithQuery {
  
  @scala.inline
  def apply(): EntityDataWithQuery = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EntityDataWithQuery]
  }
  
  @scala.inline
  implicit class EntityDataWithQueryOps[Self <: EntityDataWithQuery] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    
    @scala.inline
    def setSort$(value: js.Any): Self = this.set("sort$", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSort$: Self = this.set("sort$", js.undefined)
  }
}
