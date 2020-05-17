package typingsSlinky.tensorflowTfjsNode

import typingsSlinky.node.Buffer
import typingsSlinky.tensorflowTfjsCore.typesMod.ModelArtifacts
import typingsSlinky.tensorflowTfjsNode.anon.DateSaved
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-node/dist/io/io_utils", JSImport.Namespace)
@js.native
object ioUtilsMod extends js.Object {
  def getModelArtifactsInfoForJSON(modelArtifacts: ModelArtifacts): DateSaved = js.native
  def toArrayBuffer(buf: js.Array[Buffer]): js.typedarray.ArrayBuffer = js.native
  def toArrayBuffer(buf: Buffer): js.typedarray.ArrayBuffer = js.native
  def toBuffer(ab: js.typedarray.ArrayBuffer): Buffer = js.native
}

