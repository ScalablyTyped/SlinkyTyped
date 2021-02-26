package typingsSlinky.tensorflowTfjsNode

import typingsSlinky.node.Buffer
import typingsSlinky.tensorflowTfjsCore.typesMod.ModelArtifacts
import typingsSlinky.tensorflowTfjsNode.anon.DateSaved
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ioUtilsMod {
  
  @JSImport("@tensorflow/tfjs-node/dist/io/io_utils", "getModelArtifactsInfoForJSON")
  @js.native
  def getModelArtifactsInfoForJSON(modelArtifacts: ModelArtifacts): DateSaved = js.native
  
  @JSImport("@tensorflow/tfjs-node/dist/io/io_utils", "toArrayBuffer")
  @js.native
  def toArrayBuffer(buf: js.Array[Buffer]): js.typedarray.ArrayBuffer = js.native
  @JSImport("@tensorflow/tfjs-node/dist/io/io_utils", "toArrayBuffer")
  @js.native
  def toArrayBuffer(buf: Buffer): js.typedarray.ArrayBuffer = js.native
  
  @JSImport("@tensorflow/tfjs-node/dist/io/io_utils", "toBuffer")
  @js.native
  def toBuffer(ab: js.typedarray.ArrayBuffer): Buffer = js.native
}
