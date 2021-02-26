package typingsSlinky.sparkMd5

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("spark-md5", JSImport.Namespace)
  @js.native
  class ^ () extends SparkMD5
  
  @JSImport("spark-md5", "ArrayBuffer")
  @js.native
  class ArrayBuffer () extends StObject {
    
    def append(str: js.typedarray.ArrayBuffer): ArrayBuffer = js.native
    
    def destroy(): Unit = js.native
    
    def end(): String = js.native
    def end(raw: Boolean): String = js.native
    
    def getState(): State = js.native
    
    def reset(): ArrayBuffer = js.native
    
    def setState(state: State): State = js.native
  }
  object ArrayBuffer {
    
    /* static member */
    @JSImport("spark-md5", "ArrayBuffer.hash")
    @js.native
    def hash(arr: js.typedarray.ArrayBuffer): String = js.native
    @JSImport("spark-md5", "ArrayBuffer.hash")
    @js.native
    def hash(arr: js.typedarray.ArrayBuffer, raw: Boolean): String = js.native
  }
  
  /* static member */
  @JSImport("spark-md5", "hash")
  @js.native
  def hash(str: String): String = js.native
  @JSImport("spark-md5", "hash")
  @js.native
  def hash(str: String, raw: Boolean): String = js.native
  
  /* static member */
  @JSImport("spark-md5", "hashBinary")
  @js.native
  def hashBinary(content: String): String = js.native
  @JSImport("spark-md5", "hashBinary")
  @js.native
  def hashBinary(content: String, raw: Boolean): String = js.native
  
  type JsArrayBuffer = js.typedarray.ArrayBuffer
  
  @js.native
  trait SparkMD5 extends StObject {
    
    def append(str: String): SparkMD5 = js.native
    
    def appendBinary(contents: String): SparkMD5 = js.native
    
    def destroy(): Unit = js.native
    
    def end(): String = js.native
    def end(raw: Boolean): String = js.native
    
    def getState(): State = js.native
    
    def reset(): SparkMD5 = js.native
    
    def setState(state: State): State = js.native
  }
  
  @js.native
  trait State extends StObject {
    
    var buff: js.typedarray.Uint8Array = js.native
    
    var hash: js.Array[Double] = js.native
    
    var length: Double = js.native
  }
  object State {
    
    @scala.inline
    def apply(buff: js.typedarray.Uint8Array, hash: js.Array[Double], length: Double): State = {
      val __obj = js.Dynamic.literal(buff = buff.asInstanceOf[js.Any], hash = hash.asInstanceOf[js.Any], length = length.asInstanceOf[js.Any])
      __obj.asInstanceOf[State]
    }
    
    @scala.inline
    implicit class StateMutableBuilder[Self <: State] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBuff(value: js.typedarray.Uint8Array): Self = StObject.set(x, "buff", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHash(value: js.Array[Double]): Self = StObject.set(x, "hash", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHashVarargs(value: Double*): Self = StObject.set(x, "hash", js.Array(value :_*))
      
      @scala.inline
      def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
    }
  }
}
