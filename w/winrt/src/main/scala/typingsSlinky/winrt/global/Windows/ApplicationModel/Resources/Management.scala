package typingsSlinky.winrt.global.Windows.ApplicationModel.Resources

import typingsSlinky.winrt.Windows.Foundation.Uri
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Windows.ApplicationModel.Resources.Management")
@js.native
object Management extends js.Object {
  
  @js.native
  class IndexedResourceCandidate ()
    extends typingsSlinky.winrt.Windows.ApplicationModel.Resources.Management.IndexedResourceCandidate
  
  @js.native
  class IndexedResourceQualifier ()
    extends typingsSlinky.winrt.Windows.ApplicationModel.Resources.Management.IndexedResourceQualifier
  
  @js.native
  object IndexedResourceType extends js.Object {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typingsSlinky.winrt.Windows.ApplicationModel.Resources.Management.IndexedResourceType with Double
      ] = js.native
    
    /* 1 */ val path: typingsSlinky.winrt.Windows.ApplicationModel.Resources.Management.IndexedResourceType.path with Double = js.native
    
    /* 0 */ val string: typingsSlinky.winrt.Windows.ApplicationModel.Resources.Management.IndexedResourceType.string with Double = js.native
  }
  
  @js.native
  class ResourceIndexer protected ()
    extends typingsSlinky.winrt.Windows.ApplicationModel.Resources.Management.ResourceIndexer {
    def this(projectRoot: Uri) = this()
  }
}
