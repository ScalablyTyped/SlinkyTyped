package typingsSlinky.xmlCore

import typingsSlinky.xmlCore.typesMod.ICollection
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("xml-core/dist/types/collection", JSImport.Namespace)
@js.native
object collectionMod extends js.Object {
  
  @js.native
  class Collection[I] () extends ICollection[I] {
    def this(items: js.Array[I]) = this()
    
    @JSName("Count")
    def Count_MCollection: Double = js.native
    
    var items: js.Array[I] = js.native
  }
}
