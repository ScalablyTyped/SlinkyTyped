package typingsSlinky.write

import typingsSlinky.node.Buffer
import typingsSlinky.node.fsMod.WriteFileOptions
import typingsSlinky.node.fsMod.WriteStream
import typingsSlinky.std.Extract
import typingsSlinky.std.Omit
import typingsSlinky.std.Record
import typingsSlinky.write.anon.OmitMakeDirectoryOptionsr
import typingsSlinky.write.writeStrings.encoding
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("write", JSImport.Namespace)
  @js.native
  def apply(filepath: String, data: String): js.Promise[Result[String]] = js.native
  @JSImport("write", JSImport.Namespace)
  @js.native
  def apply(filepath: String, data: String, callback: Callback[String]): Unit = js.native
  @JSImport("write", JSImport.Namespace)
  @js.native
  def apply(filepath: String, data: String, options: Options): js.Promise[Result[String]] = js.native
  @JSImport("write", JSImport.Namespace)
  @js.native
  def apply(filepath: String, data: String, options: Options, callback: Callback[String]): Unit = js.native
  @JSImport("write", JSImport.Namespace)
  @js.native
  def apply(filepath: String, data: js.typedarray.Uint8Array): js.Promise[Result[js.typedarray.Uint8Array]] = js.native
  @JSImport("write", JSImport.Namespace)
  @js.native
  def apply(filepath: String, data: js.typedarray.Uint8Array, callback: Callback[js.typedarray.Uint8Array]): Unit = js.native
  @JSImport("write", JSImport.Namespace)
  @js.native
  def apply(filepath: String, data: js.typedarray.Uint8Array, options: Options): js.Promise[Result[js.typedarray.Uint8Array]] = js.native
  @JSImport("write", JSImport.Namespace)
  @js.native
  def apply(
    filepath: String,
    data: js.typedarray.Uint8Array,
    options: Options,
    callback: Callback[js.typedarray.Uint8Array]
  ): Unit = js.native
  @JSImport("write", JSImport.Namespace)
  @js.native
  def apply(filepath: String, data: Buffer): js.Promise[Result[Buffer]] = js.native
  @JSImport("write", JSImport.Namespace)
  @js.native
  def apply(filepath: String, data: Buffer, callback: Callback[Buffer]): Unit = js.native
  @JSImport("write", JSImport.Namespace)
  @js.native
  def apply(filepath: String, data: Buffer, options: Options): js.Promise[Result[Buffer]] = js.native
  @JSImport("write", JSImport.Namespace)
  @js.native
  def apply(filepath: String, data: Buffer, options: Options, callback: Callback[Buffer]): Unit = js.native
  
  @JSImport("write", "stream")
  @js.native
  def stream(filepath: String): WriteStream = js.native
  @JSImport("write", "stream")
  @js.native
  def stream(filepath: String, options: StreamOptions): WriteStream = js.native
  
  @JSImport("write", "sync")
  @js.native
  def sync(filepath: String, data: String): Result[String] = js.native
  @JSImport("write", "sync")
  @js.native
  def sync(filepath: String, data: String, options: Options): Result[String] = js.native
  @JSImport("write", "sync")
  @js.native
  def sync(filepath: String, data: js.typedarray.Uint8Array): Result[js.typedarray.Uint8Array] = js.native
  @JSImport("write", "sync")
  @js.native
  def sync(filepath: String, data: js.typedarray.Uint8Array, options: Options): Result[js.typedarray.Uint8Array] = js.native
  @JSImport("write", "sync")
  @js.native
  def sync(filepath: String, data: Buffer): Result[Buffer] = js.native
  @JSImport("write", "sync")
  @js.native
  def sync(filepath: String, data: Buffer, options: Options): Result[Buffer] = js.native
  
  type Callback[T /* <: Data */] = js.Function2[/* err */ js.Error | Null, /* result */ js.UndefOr[Result[T]], js.Any]
  
  @js.native
  trait CommonOptions extends StObject {
    
    var increment: js.UndefOr[Boolean] = js.native
    
    var newline: js.UndefOr[Boolean] = js.native
    
    var overwrite: js.UndefOr[Boolean] = js.native
  }
  object CommonOptions {
    
    @scala.inline
    def apply(): CommonOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CommonOptions]
    }
    
    @scala.inline
    implicit class CommonOptionsMutableBuilder[Self <: CommonOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setIncrement(value: Boolean): Self = StObject.set(x, "increment", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIncrementUndefined: Self = StObject.set(x, "increment", js.undefined)
      
      @scala.inline
      def setNewline(value: Boolean): Self = StObject.set(x, "newline", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNewlineUndefined: Self = StObject.set(x, "newline", js.undefined)
      
      @scala.inline
      def setOverwrite(value: Boolean): Self = StObject.set(x, "overwrite", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOverwriteUndefined: Self = StObject.set(x, "overwrite", js.undefined)
    }
  }
  
  type CreateWriteStreamOptions = Extract[
    /* import warning: importer.ImportType#apply Failed type conversion: std.Parameters<write.anon.FnCall>[1] */ js.Any, 
    Record[String, js.Any]
  ]
  
  type Data = String | Buffer | js.typedarray.Uint8Array
  
  type Options = (Omit[WriteFileOptions, encoding]) with OmitMakeDirectoryOptionsr with CommonOptions
  
  @js.native
  trait Result[T /* <: Data */] extends StObject {
    
    var data: T = js.native
    
    var path: String = js.native
  }
  object Result {
    
    @scala.inline
    def apply[T /* <: Data */](data: T, path: String): Result[T] = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
      __obj.asInstanceOf[Result[T]]
    }
    
    @scala.inline
    implicit class ResultMutableBuilder[Self <: Result[_], T /* <: Data */] (val x: Self with Result[T]) extends AnyVal {
      
      @scala.inline
      def setData(value: T): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    }
  }
  
  type StreamOptions = (Omit[CreateWriteStreamOptions, encoding]) with OmitMakeDirectoryOptionsr with CommonOptions
}
