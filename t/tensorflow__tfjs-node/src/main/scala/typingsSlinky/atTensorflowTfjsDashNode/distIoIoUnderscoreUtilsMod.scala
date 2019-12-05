package typingsSlinky.atTensorflowTfjsDashNode

import typingsSlinky.atTensorflowTfjsDashCore.distIoTypesMod.ModelArtifacts
import typingsSlinky.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-node/dist/io/io_utils", JSImport.Namespace)
@js.native
object distIoIoUnderscoreUtilsMod extends js.Object {
  def getModelArtifactsInfoForJSON(modelArtifacts: ModelArtifacts): Anon_DateSaved = js.native
  def toArrayBuffer(buf: js.Array[Buffer]): scala.scalajs.js.typedarray.ArrayBuffer = js.native
  def toArrayBuffer(buf: Buffer): scala.scalajs.js.typedarray.ArrayBuffer = js.native
  def toBuffer(ab: scala.scalajs.js.typedarray.ArrayBuffer): Buffer = js.native
}

