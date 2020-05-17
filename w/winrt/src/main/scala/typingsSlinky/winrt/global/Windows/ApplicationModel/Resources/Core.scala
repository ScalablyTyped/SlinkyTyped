package typingsSlinky.winrt.global.Windows.ApplicationModel.Resources

import typingsSlinky.winrt.Windows.Foundation.Collections.IIterable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.ApplicationModel.Resources.Core")
@js.native
object Core extends js.Object {
  @js.native
  class NamedResource ()
    extends typingsSlinky.winrt.Windows.ApplicationModel.Resources.Core.NamedResource
  
  @js.native
  class ResourceCandidate ()
    extends typingsSlinky.winrt.Windows.ApplicationModel.Resources.Core.ResourceCandidate
  
  @js.native
  class ResourceCandidateVectorView ()
    extends typingsSlinky.winrt.Windows.ApplicationModel.Resources.Core.ResourceCandidateVectorView
  
  @js.native
  class ResourceContext ()
    extends typingsSlinky.winrt.Windows.ApplicationModel.Resources.Core.ResourceContext
  
  @js.native
  class ResourceContextLanguagesVectorView ()
    extends typingsSlinky.winrt.Windows.ApplicationModel.Resources.Core.ResourceContextLanguagesVectorView
  
  @js.native
  class ResourceManager ()
    extends typingsSlinky.winrt.Windows.ApplicationModel.Resources.Core.ResourceManager
  
  @js.native
  class ResourceMap ()
    extends typingsSlinky.winrt.Windows.ApplicationModel.Resources.Core.ResourceMap
  
  @js.native
  class ResourceMapIterator ()
    extends typingsSlinky.winrt.Windows.ApplicationModel.Resources.Core.ResourceMapIterator
  
  @js.native
  class ResourceMapMapView ()
    extends typingsSlinky.winrt.Windows.ApplicationModel.Resources.Core.ResourceMapMapView
  
  @js.native
  class ResourceMapMapViewIterator ()
    extends typingsSlinky.winrt.Windows.ApplicationModel.Resources.Core.ResourceMapMapViewIterator
  
  @js.native
  class ResourceQualifier ()
    extends typingsSlinky.winrt.Windows.ApplicationModel.Resources.Core.ResourceQualifier
  
  @js.native
  class ResourceQualifierMapView ()
    extends typingsSlinky.winrt.Windows.ApplicationModel.Resources.Core.ResourceQualifierMapView
  
  @js.native
  class ResourceQualifierObservableMap ()
    extends typingsSlinky.winrt.Windows.ApplicationModel.Resources.Core.ResourceQualifierObservableMap
  
  @js.native
  class ResourceQualifierVectorView ()
    extends typingsSlinky.winrt.Windows.ApplicationModel.Resources.Core.ResourceQualifierVectorView
  
  /* static members */
  @js.native
  object ResourceContext extends js.Object {
    def createMatchingContext(result: IIterable[typingsSlinky.winrt.Windows.ApplicationModel.Resources.Core.ResourceQualifier]): typingsSlinky.winrt.Windows.ApplicationModel.Resources.Core.ResourceContext = js.native
  }
  
  /* static members */
  @js.native
  object ResourceManager extends js.Object {
    var current: typingsSlinky.winrt.Windows.ApplicationModel.Resources.Core.ResourceManager = js.native
    def isResourceReference(resourceReference: String): Boolean = js.native
  }
  
}

