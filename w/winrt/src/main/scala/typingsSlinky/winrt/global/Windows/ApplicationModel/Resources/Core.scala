package typingsSlinky.winrt.global.Windows.ApplicationModel.Resources

import typingsSlinky.winrt.Windows.Foundation.Collections.IIterable
import typingsSlinky.winrt.Windows.Foundation.Collections.IIterator
import typingsSlinky.winrt.Windows.Foundation.Collections.IKeyValuePair
import typingsSlinky.winrt.Windows.Foundation.Collections.IMapView
import typingsSlinky.winrt.Windows.Foundation.Collections.IVectorView
import typingsSlinky.winrt.Windows.Foundation.IAsyncOperation
import typingsSlinky.winrt.Windows.Storage.IStorageFile
import typingsSlinky.winrt.Windows.Storage.StorageFile
import typingsSlinky.winrt.anon.First
import typingsSlinky.winrt.anon.Items
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
    extends typingsSlinky.winrt.Windows.ApplicationModel.Resources.Core.ResourceCandidate {
    /* CompleteClass */
    override var isDefault: Boolean = js.native
    /* CompleteClass */
    override var isMatch: Boolean = js.native
    /* CompleteClass */
    override var isMatchAsDefault: Boolean = js.native
    /* CompleteClass */
    override var qualifiers: IVectorView[typingsSlinky.winrt.Windows.ApplicationModel.Resources.Core.ResourceQualifier] = js.native
    /* CompleteClass */
    override var valueAsString: String = js.native
    /* CompleteClass */
    override def getQualifierValue(qualifierName: String): String = js.native
    /* CompleteClass */
    override def getValueAsFileAsync(): IAsyncOperation[StorageFile] = js.native
  }
  
  @js.native
  class ResourceCandidateVectorView ()
    extends typingsSlinky.winrt.Windows.ApplicationModel.Resources.Core.ResourceCandidateVectorView {
    /* CompleteClass */
    override def first(): IIterator[typingsSlinky.winrt.Windows.ApplicationModel.Resources.Core.ResourceCandidate] = js.native
  }
  
  @js.native
  class ResourceContext ()
    extends typingsSlinky.winrt.Windows.ApplicationModel.Resources.Core.ResourceContext
  
  @js.native
  class ResourceContextLanguagesVectorView ()
    extends typingsSlinky.winrt.Windows.ApplicationModel.Resources.Core.ResourceContextLanguagesVectorView {
    /* CompleteClass */
    override def first(): IIterator[String] = js.native
  }
  
  @js.native
  class ResourceManager ()
    extends typingsSlinky.winrt.Windows.ApplicationModel.Resources.Core.ResourceManager {
    /* CompleteClass */
    override var allResourceMaps: IMapView[String, typingsSlinky.winrt.Windows.ApplicationModel.Resources.Core.ResourceMap] = js.native
    /* CompleteClass */
    override var defaultContext: typingsSlinky.winrt.Windows.ApplicationModel.Resources.Core.ResourceContext = js.native
    /* CompleteClass */
    override var mainResourceMap: typingsSlinky.winrt.Windows.ApplicationModel.Resources.Core.ResourceMap = js.native
    /* CompleteClass */
    override def loadPriFiles(files: IIterable[IStorageFile]): Unit = js.native
    /* CompleteClass */
    override def unloadPriFiles(files: IIterable[IStorageFile]): Unit = js.native
  }
  
  @js.native
  class ResourceMap ()
    extends typingsSlinky.winrt.Windows.ApplicationModel.Resources.Core.ResourceMap {
    /* CompleteClass */
    override var size: Double = js.native
    /* CompleteClass */
    override def first(): IIterator[
        IKeyValuePair[String, typingsSlinky.winrt.Windows.ApplicationModel.Resources.Core.NamedResource]
      ] = js.native
    /* CompleteClass */
    override def hasKey(key: String): Boolean = js.native
    /* CompleteClass */
    override def lookup(key: String): typingsSlinky.winrt.Windows.ApplicationModel.Resources.Core.NamedResource = js.native
    /* CompleteClass */
    override def split(): First[String, typingsSlinky.winrt.Windows.ApplicationModel.Resources.Core.NamedResource] = js.native
  }
  
  @js.native
  class ResourceMapIterator ()
    extends typingsSlinky.winrt.Windows.ApplicationModel.Resources.Core.ResourceMapIterator {
    /* CompleteClass */
    override var current: IKeyValuePair[String, typingsSlinky.winrt.Windows.ApplicationModel.Resources.Core.NamedResource] = js.native
    /* CompleteClass */
    override var hasCurrent: Boolean = js.native
    /* CompleteClass */
    override def getMany(): Items[
        IKeyValuePair[String, typingsSlinky.winrt.Windows.ApplicationModel.Resources.Core.NamedResource]
      ] = js.native
    /* CompleteClass */
    override def moveNext(): Boolean = js.native
  }
  
  @js.native
  class ResourceMapMapView ()
    extends typingsSlinky.winrt.Windows.ApplicationModel.Resources.Core.ResourceMapMapView {
    /* CompleteClass */
    override var size: Double = js.native
    /* CompleteClass */
    override def first(): IIterator[
        IKeyValuePair[String, typingsSlinky.winrt.Windows.ApplicationModel.Resources.Core.ResourceMap]
      ] = js.native
    /* CompleteClass */
    override def hasKey(key: String): Boolean = js.native
    /* CompleteClass */
    override def lookup(key: String): typingsSlinky.winrt.Windows.ApplicationModel.Resources.Core.ResourceMap = js.native
    /* CompleteClass */
    override def split(): First[String, typingsSlinky.winrt.Windows.ApplicationModel.Resources.Core.ResourceMap] = js.native
  }
  
  @js.native
  class ResourceMapMapViewIterator ()
    extends typingsSlinky.winrt.Windows.ApplicationModel.Resources.Core.ResourceMapMapViewIterator {
    /* CompleteClass */
    override var current: IKeyValuePair[String, typingsSlinky.winrt.Windows.ApplicationModel.Resources.Core.ResourceMap] = js.native
    /* CompleteClass */
    override var hasCurrent: Boolean = js.native
    /* CompleteClass */
    override def getMany(): Items[
        IKeyValuePair[String, typingsSlinky.winrt.Windows.ApplicationModel.Resources.Core.ResourceMap]
      ] = js.native
    /* CompleteClass */
    override def moveNext(): Boolean = js.native
  }
  
  @js.native
  class ResourceQualifier ()
    extends typingsSlinky.winrt.Windows.ApplicationModel.Resources.Core.ResourceQualifier {
    /* CompleteClass */
    override var isDefault: Boolean = js.native
    /* CompleteClass */
    override var isMatch: Boolean = js.native
    /* CompleteClass */
    override var qualifierName: String = js.native
    /* CompleteClass */
    override var qualifierValue: String = js.native
    /* CompleteClass */
    override var score: Double = js.native
  }
  
  @js.native
  class ResourceQualifierMapView ()
    extends typingsSlinky.winrt.Windows.ApplicationModel.Resources.Core.ResourceQualifierMapView {
    /* CompleteClass */
    override var size: Double = js.native
    /* CompleteClass */
    override def first(): IIterator[IKeyValuePair[String, String]] = js.native
    /* CompleteClass */
    override def hasKey(key: String): Boolean = js.native
    /* CompleteClass */
    override def lookup(key: String): String = js.native
    /* CompleteClass */
    override def split(): First[String, String] = js.native
  }
  
  @js.native
  class ResourceQualifierObservableMap ()
    extends typingsSlinky.winrt.Windows.ApplicationModel.Resources.Core.ResourceQualifierObservableMap {
    /* CompleteClass */
    override var onmapchanged: js.Any = js.native
    /* CompleteClass */
    override var size: Double = js.native
    /* CompleteClass */
    override def clear(): Unit = js.native
    /* CompleteClass */
    override def first(): IIterator[IKeyValuePair[String, String]] = js.native
    /* CompleteClass */
    override def getView(): IMapView[String, String] = js.native
    /* CompleteClass */
    override def hasKey(key: String): Boolean = js.native
    /* CompleteClass */
    override def insert(key: String, value: String): Boolean = js.native
    /* CompleteClass */
    override def lookup(key: String): String = js.native
    /* CompleteClass */
    override def remove(key: String): Unit = js.native
  }
  
  @js.native
  class ResourceQualifierVectorView ()
    extends typingsSlinky.winrt.Windows.ApplicationModel.Resources.Core.ResourceQualifierVectorView {
    /* CompleteClass */
    override def first(): IIterator[typingsSlinky.winrt.Windows.ApplicationModel.Resources.Core.ResourceQualifier] = js.native
  }
  
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

