package typingsSlinky.xmlCore

import typingsSlinky.xmlCore.collectionMod.Collection
import typingsSlinky.xmlCore.typesMod.XmlNamespace
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("xml-core/dist/types/namespace_manager", JSImport.Namespace)
@js.native
object namespaceManagerMod extends js.Object {
  
  @js.native
  class NamespaceManager () extends Collection[XmlNamespace] {
    
    def GetNamespace(namespaceUrl: String): XmlNamespace | Null = js.native
    def GetNamespace(namespaceUrl: String, start: Double): XmlNamespace | Null = js.native
    
    def GetPrefix(prefix: String): XmlNamespace | Null = js.native
    def GetPrefix(prefix: String, start: Double): XmlNamespace | Null = js.native
  }
}
