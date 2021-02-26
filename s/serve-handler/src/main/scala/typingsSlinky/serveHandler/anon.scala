package typingsSlinky.serveHandler

import typingsSlinky.node.Buffer
import typingsSlinky.node.BufferEncoding
import typingsSlinky.node.NodeJS.ErrnoException
import typingsSlinky.node.anon.AutoClose
import typingsSlinky.node.anon.BaseEncodingOptionswithFi
import typingsSlinky.node.anon.BaseEncodingOptionswithFiEncoding
import typingsSlinky.node.anon.Encoding
import typingsSlinky.node.anon.WithFileTypes
import typingsSlinky.node.fsMod.BaseEncodingOptions
import typingsSlinky.node.fsMod.BufferEncodingOption
import typingsSlinky.node.fsMod.Dirent
import typingsSlinky.node.fsMod.PathLike
import typingsSlinky.node.fsMod.ReadStream
import typingsSlinky.node.fsMod.Stats
import typingsSlinky.serveHandler.serveHandlerStrings.buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait FnCall extends StObject {
    
    def apply(path: PathLike): ReadStream = js.native
    def apply(path: PathLike, options: String): ReadStream = js.native
    def apply(path: PathLike, options: AutoClose): ReadStream = js.native
  }
  
  @js.native
  trait Key extends StObject {
    
    var key: String = js.native
    
    var value: String = js.native
  }
  object Key {
    
    @scala.inline
    def apply(key: String, value: String): Key = {
      val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[Key]
    }
    
    @scala.inline
    implicit class KeyMutableBuilder[Self <: Key] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Typeoflstat extends StObject {
    
    def apply(path: PathLike, callback: js.Function2[/* err */ ErrnoException | Null, /* stats */ Stats, Unit]): Unit = js.native
  }
  
  @js.native
  trait Typeofreaddir extends StObject {
    
    def apply(
      path: PathLike,
      callback: js.Function2[/* err */ ErrnoException | Null, /* files */ js.Array[String], Unit]
    ): Unit = js.native
    def apply(
      path: PathLike,
      options: js.UndefOr[scala.Nothing],
      callback: js.Function2[ErrnoException | Null, /* files */ js.Array[Buffer | String], Unit]
    ): Unit = js.native
    def apply(
      path: PathLike,
      options: Null,
      callback: js.Function2[ErrnoException | Null, /* files */ js.Array[Buffer | String], Unit]
    ): Unit = js.native
    def apply(
      path: PathLike,
      options: BufferEncoding,
      callback: js.Function2[ErrnoException | Null, /* files */ js.Array[Buffer | String], Unit]
    ): Unit = js.native
    def apply(
      path: PathLike,
      options: BaseEncodingOptionswithFiEncoding,
      callback: js.Function2[/* err */ ErrnoException | Null, /* files */ js.Array[Dirent], Unit]
    ): Unit = js.native
    def apply(
      path: PathLike,
      options: BaseEncodingOptionswithFi,
      callback: js.Function2[/* err */ ErrnoException | Null, /* files */ js.Array[Buffer | String], Unit]
    ): Unit = js.native
    def apply(
      path: PathLike,
      options: Encoding,
      callback: js.Function2[/* err */ ErrnoException | Null, /* files */ js.Array[Buffer], Unit]
    ): Unit = js.native
    def apply(
      path: PathLike,
      options: WithFileTypes,
      callback: js.Function2[/* err */ ErrnoException | Null, /* files */ js.Array[String], Unit]
    ): Unit = js.native
    def apply(
      path: PathLike,
      options: buffer,
      callback: js.Function2[/* err */ ErrnoException | Null, /* files */ js.Array[Buffer], Unit]
    ): Unit = js.native
  }
  
  @js.native
  trait Typeofrealpath extends StObject {
    
    def apply(
      path: PathLike,
      callback: js.Function2[/* err */ ErrnoException | Null, /* resolvedPath */ String, Unit]
    ): Unit = js.native
    def apply(
      path: PathLike,
      options: js.UndefOr[scala.Nothing],
      callback: js.Function2[ErrnoException | Null, Buffer | (/* resolvedPath */ String), Unit]
    ): Unit = js.native
    def apply(
      path: PathLike,
      options: String,
      callback: js.Function2[/* err */ ErrnoException | Null, /* resolvedPath */ String | Buffer, Unit]
    ): Unit = js.native
    def apply(
      path: PathLike,
      options: Null,
      callback: js.Function2[ErrnoException | Null, Buffer | (/* resolvedPath */ String), Unit]
    ): Unit = js.native
    def apply(
      path: PathLike,
      options: BufferEncoding,
      callback: js.Function2[/* err */ ErrnoException | Null, /* resolvedPath */ String, Unit]
    ): Unit = js.native
    def apply(
      path: PathLike,
      options: BaseEncodingOptions,
      callback: js.Function2[ErrnoException | Null, Buffer | (/* resolvedPath */ String), Unit]
    ): Unit = js.native
    def apply(
      path: PathLike,
      options: BufferEncodingOption,
      callback: js.Function2[/* err */ ErrnoException | Null, /* resolvedPath */ Buffer, Unit]
    ): Unit = js.native
    
    def native(
      path: PathLike,
      callback: js.Function2[/* err */ ErrnoException | Null, /* resolvedPath */ String, Unit]
    ): Unit = js.native
    def native(
      path: PathLike,
      options: js.UndefOr[scala.Nothing],
      callback: js.Function2[ErrnoException | Null, Buffer | (/* resolvedPath */ String), Unit]
    ): Unit = js.native
    def native(
      path: PathLike,
      options: String,
      callback: js.Function2[/* err */ ErrnoException | Null, /* resolvedPath */ String | Buffer, Unit]
    ): Unit = js.native
    def native(
      path: PathLike,
      options: Null,
      callback: js.Function2[ErrnoException | Null, Buffer | (/* resolvedPath */ String), Unit]
    ): Unit = js.native
    def native(
      path: PathLike,
      options: BufferEncoding,
      callback: js.Function2[/* err */ ErrnoException | Null, /* resolvedPath */ String, Unit]
    ): Unit = js.native
    def native(
      path: PathLike,
      options: BaseEncodingOptions,
      callback: js.Function2[ErrnoException | Null, Buffer | (/* resolvedPath */ String), Unit]
    ): Unit = js.native
    def native(
      path: PathLike,
      options: BufferEncodingOption,
      callback: js.Function2[/* err */ ErrnoException | Null, /* resolvedPath */ Buffer, Unit]
    ): Unit = js.native
  }
}
