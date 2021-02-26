package typingsSlinky.streamingJsonStringify

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Shortcut
import typingsSlinky.node.BufferEncoding
import typingsSlinky.node.anon.Chunk
import typingsSlinky.node.streamMod.Transform
import typingsSlinky.node.streamMod.TransformCallback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("streaming-json-stringify", JSImport.Namespace)
  @js.native
  val ^ : StringifyFactory = js.native
  
  @js.native
  trait Instance extends StObject {
    
    var closer: String = js.native
    
    var opener: String = js.native
    
    def replacer(key: String, value: js.Any): js.Any = js.native
    @JSName("replacer")
    var replacer_Original: Replacer = js.native
    
    var seperator: String = js.native
    
    var space: String | Double = js.native
    
    def stringifier(value: js.Any, replacer: Replacer, space: String): String = js.native
    def stringifier(value: js.Any, replacer: Replacer, space: Double): String = js.native
  }
  
  /* Inlined std.Partial<streaming-json-stringify.streaming-json-stringify.Instance> & node.stream.TransformOptions */
  @js.native
  trait Options extends StObject {
    
    var allowHalfOpen: js.UndefOr[Boolean] = js.native
    
    var autoDestroy: js.UndefOr[Boolean] = js.native
    
    var closer: js.UndefOr[String] = js.native
    
    var decodeStrings: js.UndefOr[Boolean] = js.native
    
    var defaultEncoding: js.UndefOr[BufferEncoding] = js.native
    
    var destroy: js.UndefOr[
        js.ThisFunction2[
          /* this */ Transform, 
          /* error */ js.Error | Null, 
          /* callback */ js.Function1[/* error */ js.Error | Null, Unit], 
          Unit
        ]
      ] = js.native
    
    var emitClose: js.UndefOr[Boolean] = js.native
    
    var encoding: js.UndefOr[BufferEncoding] = js.native
    
    var `final`: js.UndefOr[
        js.ThisFunction1[
          /* this */ Transform, 
          /* callback */ js.Function1[/* error */ js.UndefOr[js.Error | Null], Unit], 
          Unit
        ]
      ] = js.native
    
    var flush: js.UndefOr[js.ThisFunction1[/* this */ Transform, /* callback */ TransformCallback, Unit]] = js.native
    
    var highWaterMark: js.UndefOr[Double] = js.native
    
    var objectMode: js.UndefOr[Boolean] = js.native
    
    var opener: js.UndefOr[String] = js.native
    
    var read: js.UndefOr[js.ThisFunction1[/* this */ Transform, /* size */ Double, Unit]] = js.native
    
    var readableHighWaterMark: js.UndefOr[Double] = js.native
    
    var readableObjectMode: js.UndefOr[Boolean] = js.native
    
    var replacer: js.UndefOr[Replacer] = js.native
    
    var seperator: js.UndefOr[String] = js.native
    
    var space: js.UndefOr[String | Double] = js.native
    
    var stringifier: js.UndefOr[
        js.Function3[/* value */ js.Any, /* replacer */ Replacer, /* space */ String | Double, String]
      ] = js.native
    
    var transform: js.UndefOr[
        js.ThisFunction3[
          /* this */ Transform, 
          /* chunk */ js.Any, 
          /* encoding */ BufferEncoding, 
          /* callback */ TransformCallback, 
          Unit
        ]
      ] = js.native
    
    var writableCorked: js.UndefOr[Double] = js.native
    
    var writableHighWaterMark: js.UndefOr[Double] = js.native
    
    var writableObjectMode: js.UndefOr[Boolean] = js.native
    
    var write: js.UndefOr[
        js.ThisFunction3[
          /* this */ Transform, 
          /* chunk */ js.Any, 
          /* encoding */ BufferEncoding, 
          /* callback */ js.Function1[/* error */ js.UndefOr[js.Error | Null], Unit], 
          Unit
        ]
      ] = js.native
    
    var writev: js.UndefOr[
        js.ThisFunction2[
          /* this */ Transform, 
          /* chunks */ js.Array[Chunk], 
          /* callback */ js.Function1[/* error */ js.UndefOr[js.Error | Null], Unit], 
          Unit
        ]
      ] = js.native
  }
  object Options {
    
    @scala.inline
    def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAllowHalfOpen(value: Boolean): Self = StObject.set(x, "allowHalfOpen", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAllowHalfOpenUndefined: Self = StObject.set(x, "allowHalfOpen", js.undefined)
      
      @scala.inline
      def setAutoDestroy(value: Boolean): Self = StObject.set(x, "autoDestroy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutoDestroyUndefined: Self = StObject.set(x, "autoDestroy", js.undefined)
      
      @scala.inline
      def setCloser(value: String): Self = StObject.set(x, "closer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCloserUndefined: Self = StObject.set(x, "closer", js.undefined)
      
      @scala.inline
      def setDecodeStrings(value: Boolean): Self = StObject.set(x, "decodeStrings", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDecodeStringsUndefined: Self = StObject.set(x, "decodeStrings", js.undefined)
      
      @scala.inline
      def setDefaultEncoding(value: BufferEncoding): Self = StObject.set(x, "defaultEncoding", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultEncodingUndefined: Self = StObject.set(x, "defaultEncoding", js.undefined)
      
      @scala.inline
      def setDestroy(
        value: js.ThisFunction2[
              /* this */ Transform, 
              /* error */ js.Error | Null, 
              /* callback */ js.Function1[/* error */ js.Error | Null, Unit], 
              Unit
            ]
      ): Self = StObject.set(x, "destroy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDestroyUndefined: Self = StObject.set(x, "destroy", js.undefined)
      
      @scala.inline
      def setEmitClose(value: Boolean): Self = StObject.set(x, "emitClose", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEmitCloseUndefined: Self = StObject.set(x, "emitClose", js.undefined)
      
      @scala.inline
      def setEncoding(value: BufferEncoding): Self = StObject.set(x, "encoding", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEncodingUndefined: Self = StObject.set(x, "encoding", js.undefined)
      
      @scala.inline
      def setFinal(
        value: js.ThisFunction1[
              /* this */ Transform, 
              /* callback */ js.Function1[/* error */ js.UndefOr[js.Error | Null], Unit], 
              Unit
            ]
      ): Self = StObject.set(x, "final", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFinalUndefined: Self = StObject.set(x, "final", js.undefined)
      
      @scala.inline
      def setFlush(value: js.ThisFunction1[/* this */ Transform, /* callback */ TransformCallback, Unit]): Self = StObject.set(x, "flush", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFlushUndefined: Self = StObject.set(x, "flush", js.undefined)
      
      @scala.inline
      def setHighWaterMark(value: Double): Self = StObject.set(x, "highWaterMark", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHighWaterMarkUndefined: Self = StObject.set(x, "highWaterMark", js.undefined)
      
      @scala.inline
      def setObjectMode(value: Boolean): Self = StObject.set(x, "objectMode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setObjectModeUndefined: Self = StObject.set(x, "objectMode", js.undefined)
      
      @scala.inline
      def setOpener(value: String): Self = StObject.set(x, "opener", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOpenerUndefined: Self = StObject.set(x, "opener", js.undefined)
      
      @scala.inline
      def setRead(value: js.ThisFunction1[/* this */ Transform, /* size */ Double, Unit]): Self = StObject.set(x, "read", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReadUndefined: Self = StObject.set(x, "read", js.undefined)
      
      @scala.inline
      def setReadableHighWaterMark(value: Double): Self = StObject.set(x, "readableHighWaterMark", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReadableHighWaterMarkUndefined: Self = StObject.set(x, "readableHighWaterMark", js.undefined)
      
      @scala.inline
      def setReadableObjectMode(value: Boolean): Self = StObject.set(x, "readableObjectMode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReadableObjectModeUndefined: Self = StObject.set(x, "readableObjectMode", js.undefined)
      
      @scala.inline
      def setReplacer(value: (/* key */ String, /* value */ js.Any) => js.Any): Self = StObject.set(x, "replacer", js.Any.fromFunction2(value))
      
      @scala.inline
      def setReplacerUndefined: Self = StObject.set(x, "replacer", js.undefined)
      
      @scala.inline
      def setSeperator(value: String): Self = StObject.set(x, "seperator", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSeperatorUndefined: Self = StObject.set(x, "seperator", js.undefined)
      
      @scala.inline
      def setSpace(value: String | Double): Self = StObject.set(x, "space", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSpaceUndefined: Self = StObject.set(x, "space", js.undefined)
      
      @scala.inline
      def setStringifier(value: (/* value */ js.Any, /* replacer */ Replacer, /* space */ String | Double) => String): Self = StObject.set(x, "stringifier", js.Any.fromFunction3(value))
      
      @scala.inline
      def setStringifierUndefined: Self = StObject.set(x, "stringifier", js.undefined)
      
      @scala.inline
      def setTransform(
        value: js.ThisFunction3[
              /* this */ Transform, 
              /* chunk */ js.Any, 
              /* encoding */ BufferEncoding, 
              /* callback */ TransformCallback, 
              Unit
            ]
      ): Self = StObject.set(x, "transform", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTransformUndefined: Self = StObject.set(x, "transform", js.undefined)
      
      @scala.inline
      def setWritableCorked(value: Double): Self = StObject.set(x, "writableCorked", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWritableCorkedUndefined: Self = StObject.set(x, "writableCorked", js.undefined)
      
      @scala.inline
      def setWritableHighWaterMark(value: Double): Self = StObject.set(x, "writableHighWaterMark", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWritableHighWaterMarkUndefined: Self = StObject.set(x, "writableHighWaterMark", js.undefined)
      
      @scala.inline
      def setWritableObjectMode(value: Boolean): Self = StObject.set(x, "writableObjectMode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWritableObjectModeUndefined: Self = StObject.set(x, "writableObjectMode", js.undefined)
      
      @scala.inline
      def setWrite(
        value: js.ThisFunction3[
              /* this */ Transform, 
              /* chunk */ js.Any, 
              /* encoding */ BufferEncoding, 
              /* callback */ js.Function1[/* error */ js.UndefOr[js.Error | Null], Unit], 
              Unit
            ]
      ): Self = StObject.set(x, "write", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWriteUndefined: Self = StObject.set(x, "write", js.undefined)
      
      @scala.inline
      def setWritev(
        value: js.ThisFunction2[
              /* this */ Transform, 
              /* chunks */ js.Array[Chunk], 
              /* callback */ js.Function1[/* error */ js.UndefOr[js.Error | Null], Unit], 
              Unit
            ]
      ): Self = StObject.set(x, "writev", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWritevUndefined: Self = StObject.set(x, "writev", js.undefined)
    }
  }
  
  type Replacer = js.Function2[/* key */ String, /* value */ js.Any, js.Any]
  
  @js.native
  trait StringifyFactory
    extends Instantiable0[Instance with Transform]
       with Instantiable1[/* options */ Options, Instance with Transform] {
    
    def apply(): Instance with Transform = js.native
    def apply(options: Options): Instance with Transform = js.native
  }
  
  type _To = StringifyFactory
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: StringifyFactory = ^
}
