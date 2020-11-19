package typingsSlinky.snabbdom

import typingsSlinky.snabbdom.moduleMod.Module
import typingsSlinky.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("snabbdom/build/package/modules/attributes", JSImport.Namespace)
@js.native
object attributesMod extends js.Object {
  
  val attributesModule: Module = js.native
  
  type Attrs = Record[String, String | Double | Boolean]
}
