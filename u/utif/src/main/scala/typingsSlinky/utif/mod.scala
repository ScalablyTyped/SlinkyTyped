package typingsSlinky.utif

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.node.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("utif", "decode")
  @js.native
  def decode(buffer: js.typedarray.ArrayBuffer): js.Array[IFD] = js.native
  @JSImport("utif", "decode")
  @js.native
  def decode(buffer: Buffer): js.Array[IFD] = js.native
  
  @JSImport("utif", "decodeImage")
  @js.native
  def decodeImage(buffer: js.typedarray.ArrayBuffer, ifd: IFD): Unit = js.native
  @JSImport("utif", "decodeImage")
  @js.native
  def decodeImage(buffer: Buffer, ifd: IFD): Unit = js.native
  
  @JSImport("utif", "encode")
  @js.native
  def encode(ifds: js.Array[IFD]): js.typedarray.ArrayBuffer = js.native
  
  @JSImport("utif", "encodeImage")
  @js.native
  def encodeImage(rgba: js.typedarray.Uint8Array, w: Double, h: Double): js.typedarray.ArrayBuffer = js.native
  @JSImport("utif", "encodeImage")
  @js.native
  def encodeImage(rgba: js.typedarray.Uint8Array, w: Double, h: Double, metadata: IFD): js.typedarray.ArrayBuffer = js.native
  
  @JSImport("utif", "replaceIMG")
  @js.native
  def replaceIMG(): Unit = js.native
  
  @JSImport("utif", "toRGBA8")
  @js.native
  def toRGBA8(ifd: IFD): js.typedarray.Uint8Array = js.native
  
  @js.native
  trait IFD
    extends /* property */ StringDictionary[TiffTag | Double | js.typedarray.Uint8Array] {
    
    var data: js.typedarray.Uint8Array = js.native
    
    var height: Double = js.native
    
    var width: Double = js.native
  }
  object IFD {
    
    @scala.inline
    def apply(data: js.typedarray.Uint8Array, height: Double, width: Double): IFD = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
      __obj.asInstanceOf[IFD]
    }
    
    @scala.inline
    implicit class IFDMutableBuilder[Self <: IFD] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setData(value: js.typedarray.Uint8Array): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    }
  }
  
  type TiffTag = js.Array[Double | String]
}
