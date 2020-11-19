package typingsSlinky.tensorflowTfjsLayers

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@tensorflow/tfjs-layers/dist/user_defined_metadata", JSImport.Namespace)
@js.native
object userDefinedMetadataMod extends js.Object {
  
  val MAX_USER_DEFINED_METADATA_SERIALIZED_LENGTH: Double = js.native
  
  def checkUserDefinedMetadata(userDefinedMetadata: js.Object, modelName: String): Unit = js.native
  def checkUserDefinedMetadata(userDefinedMetadata: js.Object, modelName: String, checkSize: Boolean): Unit = js.native
  
  def plainObjectCheck(x: js.Any): Boolean = js.native
}
