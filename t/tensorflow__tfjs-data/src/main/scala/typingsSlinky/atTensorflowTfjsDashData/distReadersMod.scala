package typingsSlinky.atTensorflowTfjsDashData

import org.scalajs.dom.raw.HTMLVideoElement
import typingsSlinky.atTensorflowTfjsDashCore.distTensorUnderscoreTypesMod.TensorContainer
import typingsSlinky.atTensorflowTfjsDashData.distDatasetMod.Dataset
import typingsSlinky.atTensorflowTfjsDashData.distDatasetsCsvUnderscoreDatasetMod.CSVDataset
import typingsSlinky.atTensorflowTfjsDashData.distIteratorsMicrophoneUnderscoreIteratorMod.MicrophoneIterator
import typingsSlinky.atTensorflowTfjsDashData.distIteratorsWebcamUnderscoreIteratorMod.WebcamIterator
import typingsSlinky.atTensorflowTfjsDashData.distTypesMod.CSVConfig
import typingsSlinky.atTensorflowTfjsDashData.distTypesMod.MicrophoneConfig
import typingsSlinky.atTensorflowTfjsDashData.distTypesMod.WebcamConfig
import typingsSlinky.std.IteratorResult
import typingsSlinky.std.RequestInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-data/dist/readers", JSImport.Namespace)
@js.native
object distReadersMod extends js.Object {
  def csv(source: RequestInfo): CSVDataset = js.native
  def csv(source: RequestInfo, csvConfig: CSVConfig): CSVDataset = js.native
  def func[T /* <: TensorContainer */](f: js.Function0[(IteratorResult[T, _]) | (js.Promise[IteratorResult[T, _]])]): Dataset[T] = js.native
  def generator[T /* <: TensorContainer */](generator: js.Function0[js.Iterator[T] | js.Promise[js.Iterator[T]]]): Dataset[T] = js.native
  def microphone(): js.Promise[MicrophoneIterator] = js.native
  def microphone(microphoneConfig: MicrophoneConfig): js.Promise[MicrophoneIterator] = js.native
  def webcam(): js.Promise[WebcamIterator] = js.native
  def webcam(webcamVideoElement: HTMLVideoElement): js.Promise[WebcamIterator] = js.native
  def webcam(webcamVideoElement: HTMLVideoElement, webcamConfig: WebcamConfig): js.Promise[WebcamIterator] = js.native
}

