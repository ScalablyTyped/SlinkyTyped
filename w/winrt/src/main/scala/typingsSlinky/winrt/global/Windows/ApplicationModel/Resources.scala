package typingsSlinky.winrt.global.Windows.ApplicationModel

import typingsSlinky.winrt.Windows.Foundation.Collections.IIterable
import typingsSlinky.winrt.Windows.Foundation.Uri
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Resources {
  
  object Core {
    
    @JSGlobal("Windows.ApplicationModel.Resources.Core.NamedResource")
    @js.native
    class NamedResource ()
      extends typingsSlinky.winrt.Windows.ApplicationModel.Resources.Core.NamedResource
    
    @JSGlobal("Windows.ApplicationModel.Resources.Core.ResourceCandidate")
    @js.native
    class ResourceCandidate ()
      extends typingsSlinky.winrt.Windows.ApplicationModel.Resources.Core.ResourceCandidate
    
    @JSGlobal("Windows.ApplicationModel.Resources.Core.ResourceCandidateVectorView")
    @js.native
    class ResourceCandidateVectorView ()
      extends typingsSlinky.winrt.Windows.ApplicationModel.Resources.Core.ResourceCandidateVectorView
    
    @JSGlobal("Windows.ApplicationModel.Resources.Core.ResourceContext")
    @js.native
    class ResourceContext ()
      extends typingsSlinky.winrt.Windows.ApplicationModel.Resources.Core.ResourceContext
    /* static members */
    object ResourceContext {
      
      @JSGlobal("Windows.ApplicationModel.Resources.Core.ResourceContext.createMatchingContext")
      @js.native
      def createMatchingContext(result: IIterable[typingsSlinky.winrt.Windows.ApplicationModel.Resources.Core.ResourceQualifier]): typingsSlinky.winrt.Windows.ApplicationModel.Resources.Core.ResourceContext = js.native
    }
    
    @JSGlobal("Windows.ApplicationModel.Resources.Core.ResourceContextLanguagesVectorView")
    @js.native
    class ResourceContextLanguagesVectorView ()
      extends typingsSlinky.winrt.Windows.ApplicationModel.Resources.Core.ResourceContextLanguagesVectorView
    
    @JSGlobal("Windows.ApplicationModel.Resources.Core.ResourceManager")
    @js.native
    class ResourceManager ()
      extends typingsSlinky.winrt.Windows.ApplicationModel.Resources.Core.ResourceManager
    /* static members */
    object ResourceManager {
      
      @JSGlobal("Windows.ApplicationModel.Resources.Core.ResourceManager")
      @js.native
      val ^ : js.Any = js.native
      
      @JSGlobal("Windows.ApplicationModel.Resources.Core.ResourceManager.current")
      @js.native
      def current: typingsSlinky.winrt.Windows.ApplicationModel.Resources.Core.ResourceManager = js.native
      @scala.inline
      def current_=(x: typingsSlinky.winrt.Windows.ApplicationModel.Resources.Core.ResourceManager): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("current")(x.asInstanceOf[js.Any])
      
      @JSGlobal("Windows.ApplicationModel.Resources.Core.ResourceManager.isResourceReference")
      @js.native
      def isResourceReference(resourceReference: String): Boolean = js.native
    }
    
    @JSGlobal("Windows.ApplicationModel.Resources.Core.ResourceMap")
    @js.native
    class ResourceMap ()
      extends typingsSlinky.winrt.Windows.ApplicationModel.Resources.Core.ResourceMap
    
    @JSGlobal("Windows.ApplicationModel.Resources.Core.ResourceMapIterator")
    @js.native
    class ResourceMapIterator ()
      extends typingsSlinky.winrt.Windows.ApplicationModel.Resources.Core.ResourceMapIterator
    
    @JSGlobal("Windows.ApplicationModel.Resources.Core.ResourceMapMapView")
    @js.native
    class ResourceMapMapView ()
      extends typingsSlinky.winrt.Windows.ApplicationModel.Resources.Core.ResourceMapMapView
    
    @JSGlobal("Windows.ApplicationModel.Resources.Core.ResourceMapMapViewIterator")
    @js.native
    class ResourceMapMapViewIterator ()
      extends typingsSlinky.winrt.Windows.ApplicationModel.Resources.Core.ResourceMapMapViewIterator
    
    @JSGlobal("Windows.ApplicationModel.Resources.Core.ResourceQualifier")
    @js.native
    class ResourceQualifier ()
      extends typingsSlinky.winrt.Windows.ApplicationModel.Resources.Core.ResourceQualifier
    
    @JSGlobal("Windows.ApplicationModel.Resources.Core.ResourceQualifierMapView")
    @js.native
    class ResourceQualifierMapView ()
      extends typingsSlinky.winrt.Windows.ApplicationModel.Resources.Core.ResourceQualifierMapView
    
    @JSGlobal("Windows.ApplicationModel.Resources.Core.ResourceQualifierObservableMap")
    @js.native
    class ResourceQualifierObservableMap ()
      extends typingsSlinky.winrt.Windows.ApplicationModel.Resources.Core.ResourceQualifierObservableMap
    
    @JSGlobal("Windows.ApplicationModel.Resources.Core.ResourceQualifierVectorView")
    @js.native
    class ResourceQualifierVectorView ()
      extends typingsSlinky.winrt.Windows.ApplicationModel.Resources.Core.ResourceQualifierVectorView
  }
  
  object Management {
    
    @JSGlobal("Windows.ApplicationModel.Resources.Management.IndexedResourceCandidate")
    @js.native
    class IndexedResourceCandidate ()
      extends typingsSlinky.winrt.Windows.ApplicationModel.Resources.Management.IndexedResourceCandidate
    
    @JSGlobal("Windows.ApplicationModel.Resources.Management.IndexedResourceQualifier")
    @js.native
    class IndexedResourceQualifier ()
      extends typingsSlinky.winrt.Windows.ApplicationModel.Resources.Management.IndexedResourceQualifier
    
    @JSGlobal("Windows.ApplicationModel.Resources.Management.IndexedResourceType")
    @js.native
    object IndexedResourceType extends StObject {
      
      @JSBracketAccess
      def apply(value: Double): js.UndefOr[
            typingsSlinky.winrt.Windows.ApplicationModel.Resources.Management.IndexedResourceType with Double
          ] = js.native
      
      /* 1 */ val path: typingsSlinky.winrt.Windows.ApplicationModel.Resources.Management.IndexedResourceType.path with Double = js.native
      
      /* 0 */ val string: typingsSlinky.winrt.Windows.ApplicationModel.Resources.Management.IndexedResourceType.string with Double = js.native
    }
    
    @JSGlobal("Windows.ApplicationModel.Resources.Management.ResourceIndexer")
    @js.native
    class ResourceIndexer protected ()
      extends typingsSlinky.winrt.Windows.ApplicationModel.Resources.Management.ResourceIndexer {
      def this(projectRoot: Uri) = this()
    }
  }
  
  @JSGlobal("Windows.ApplicationModel.Resources.ResourceLoader")
  @js.native
  class ResourceLoader ()
    extends typingsSlinky.winrt.Windows.ApplicationModel.Resources.ResourceLoader {
    def this(name: String) = this()
  }
  /* static members */
  object ResourceLoader {
    
    @JSGlobal("Windows.ApplicationModel.Resources.ResourceLoader.getStringForReference")
    @js.native
    def getStringForReference(uri: Uri): String = js.native
  }
}
