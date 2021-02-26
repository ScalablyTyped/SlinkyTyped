package typingsSlinky.snabbdom

import typingsSlinky.snabbdom.moduleMod.Module
import typingsSlinky.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object attributesMod {
  
  @JSImport("snabbdom/build/package/modules/attributes", "attributesModule")
  @js.native
  val attributesModule: Module = js.native
  
  type Attrs = Record[String, String | Double | Boolean]
}
