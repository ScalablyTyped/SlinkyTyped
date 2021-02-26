package typingsSlinky.tensorflowTfjsData

import org.scalajs.dom.raw.HTMLVideoElement
import typingsSlinky.std.IteratorResult
import typingsSlinky.std.RequestInfo
import typingsSlinky.tensorflowTfjsCore.tensorTypesMod.TensorContainer
import typingsSlinky.tensorflowTfjsData.csvDatasetMod.CSVDataset
import typingsSlinky.tensorflowTfjsData.datasetMod.Dataset
import typingsSlinky.tensorflowTfjsData.microphoneIteratorMod.MicrophoneIterator
import typingsSlinky.tensorflowTfjsData.typesMod.CSVConfig
import typingsSlinky.tensorflowTfjsData.typesMod.MicrophoneConfig
import typingsSlinky.tensorflowTfjsData.typesMod.WebcamConfig
import typingsSlinky.tensorflowTfjsData.webcamIteratorMod.WebcamIterator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object readersMod {
  
  @JSImport("@tensorflow/tfjs-data/dist/readers", "csv")
  @js.native
  def csv(source: RequestInfo): CSVDataset = js.native
  @JSImport("@tensorflow/tfjs-data/dist/readers", "csv")
  @js.native
  def csv(source: RequestInfo, csvConfig: CSVConfig): CSVDataset = js.native
  
  @JSImport("@tensorflow/tfjs-data/dist/readers", "func")
  @js.native
  def func[T /* <: TensorContainer */](f: js.Function0[(IteratorResult[T, _]) | (js.Promise[IteratorResult[T, _]])]): Dataset[T] = js.native
  
  @JSImport("@tensorflow/tfjs-data/dist/readers", "generator")
  @js.native
  def generator[T /* <: TensorContainer */](generator: js.Function0[js.Iterator[T] | js.Promise[js.Iterator[T]]]): Dataset[T] = js.native
  
  @JSImport("@tensorflow/tfjs-data/dist/readers", "microphone")
  @js.native
  def microphone(): js.Promise[MicrophoneIterator] = js.native
  @JSImport("@tensorflow/tfjs-data/dist/readers", "microphone")
  @js.native
  def microphone(microphoneConfig: MicrophoneConfig): js.Promise[MicrophoneIterator] = js.native
  
  @JSImport("@tensorflow/tfjs-data/dist/readers", "webcam")
  @js.native
  def webcam(): js.Promise[WebcamIterator] = js.native
  @JSImport("@tensorflow/tfjs-data/dist/readers", "webcam")
  @js.native
  def webcam(webcamVideoElement: js.UndefOr[scala.Nothing], webcamConfig: WebcamConfig): js.Promise[WebcamIterator] = js.native
  @JSImport("@tensorflow/tfjs-data/dist/readers", "webcam")
  @js.native
  def webcam(webcamVideoElement: HTMLVideoElement): js.Promise[WebcamIterator] = js.native
  @JSImport("@tensorflow/tfjs-data/dist/readers", "webcam")
  @js.native
  def webcam(webcamVideoElement: HTMLVideoElement, webcamConfig: WebcamConfig): js.Promise[WebcamIterator] = js.native
}
