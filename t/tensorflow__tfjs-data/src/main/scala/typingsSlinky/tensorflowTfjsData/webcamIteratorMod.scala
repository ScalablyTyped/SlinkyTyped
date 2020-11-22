package typingsSlinky.tensorflowTfjsData

import org.scalajs.dom.raw.HTMLVideoElement
import typingsSlinky.tensorflowTfjsCore.distTensorMod.Tensor3D
import typingsSlinky.tensorflowTfjsData.lazyIteratorMod.LazyIterator
import typingsSlinky.tensorflowTfjsData.typesMod.WebcamConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@tensorflow/tfjs-data/dist/iterators/webcam_iterator", JSImport.Namespace)
@js.native
object webcamIteratorMod extends js.Object {
  
  @js.native
  class WebcamIterator protected () extends LazyIterator[Tensor3D] {
    
    def capture(): js.Promise[Tensor3D] = js.native
    
    def cropAndResizeFrame(img: Tensor3D): Tensor3D = js.native
    
    var cropBox: js.Any = js.native
    
    var cropBoxInd: js.Any = js.native
    
    var cropSize: js.Any = js.native
    
    var isClosed: js.Any = js.native
    
    var needToResize: js.Any = js.native
    
    var resize: js.Any = js.native
    
    def start(): js.Promise[Unit] = js.native
    
    def stop(): Unit = js.native
    
    var stream: js.Any = js.native
    
    val webcamConfig: WebcamConfig = js.native
    
    val webcamVideoElement: HTMLVideoElement = js.native
  }
  /* static members */
  @js.native
  object WebcamIterator extends js.Object {
    
    def create(): js.Promise[WebcamIterator] = js.native
    def create(webcamVideoElement: js.UndefOr[scala.Nothing], webcamConfig: WebcamConfig): js.Promise[WebcamIterator] = js.native
    def create(webcamVideoElement: HTMLVideoElement): js.Promise[WebcamIterator] = js.native
    def create(webcamVideoElement: HTMLVideoElement, webcamConfig: WebcamConfig): js.Promise[WebcamIterator] = js.native
  }
}
