package typingsSlinky.ssimJs.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.ssimJs.typesMod.Matrix
  - typingsSlinky.ssimJs.typesMod.ImageData
  - typingsSlinky.ssimJs.anon.Height
*/
trait ImageMatrix extends js.Object
object ImageMatrix {
  
  @scala.inline
  def Matrix(data: js.Array[Double], height: Double, width: Double): ImageMatrix = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImageMatrix]
  }
  
  @scala.inline
  def ImageData(data: js.typedarray.Uint8ClampedArray, height: Double, width: Double): ImageMatrix = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImageMatrix]
  }
  
  @scala.inline
  def Height(
    data: js.typedarray.Uint8Array | js.typedarray.Int8Array | js.typedarray.Uint32Array | js.typedarray.Int32Array | js.typedarray.Uint16Array,
    height: Double,
    width: Double
  ): ImageMatrix = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImageMatrix]
  }
}
