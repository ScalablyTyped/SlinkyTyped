package typingsSlinky.streamingJsonStringify.mod

import typingsSlinky.node.anon.Chunk
import typingsSlinky.node.streamMod.Transform
import typingsSlinky.node.streamMod.TransformCallback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<streaming-json-stringify.streaming-json-stringify.Instance> & node.stream.TransformOptions */
@js.native
trait Options extends js.Object {
  var allowHalfOpen: js.UndefOr[Boolean] = js.native
  var autoDestroy: js.UndefOr[Boolean] = js.native
  var closer: js.UndefOr[String] = js.native
  var decodeStrings: js.UndefOr[Boolean] = js.native
  var defaultEncoding: js.UndefOr[String] = js.native
  var destroy: js.UndefOr[
    js.ThisFunction2[
      /* this */ Transform, 
      /* error */ js.Error | Null, 
      /* callback */ js.Function1[/* error */ js.Error | Null, Unit], 
      Unit
    ]
  ] = js.native
  var emitClose: js.UndefOr[Boolean] = js.native
  var encoding: js.UndefOr[String] = js.native
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
      /* encoding */ String, 
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
      /* encoding */ String, 
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
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAllowHalfOpen(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowHalfOpen")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowHalfOpen: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowHalfOpen")(js.undefined)
        ret
    }
    @scala.inline
    def withAutoDestroy(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoDestroy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoDestroy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoDestroy")(js.undefined)
        ret
    }
    @scala.inline
    def withCloser(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("closer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCloser: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("closer")(js.undefined)
        ret
    }
    @scala.inline
    def withDecodeStrings(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("decodeStrings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDecodeStrings: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("decodeStrings")(js.undefined)
        ret
    }
    @scala.inline
    def withDefaultEncoding(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultEncoding")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultEncoding: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultEncoding")(js.undefined)
        ret
    }
    @scala.inline
    def withDestroy(
      value: js.ThisFunction2[
          /* this */ Transform, 
          /* error */ js.Error | Null, 
          /* callback */ js.Function1[/* error */ js.Error | Null, Unit], 
          Unit
        ]
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("destroy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDestroy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("destroy")(js.undefined)
        ret
    }
    @scala.inline
    def withEmitClose(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("emitClose")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEmitClose: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("emitClose")(js.undefined)
        ret
    }
    @scala.inline
    def withEncoding(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("encoding")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEncoding: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("encoding")(js.undefined)
        ret
    }
    @scala.inline
    def withFinal(
      value: js.ThisFunction1[
          /* this */ Transform, 
          /* callback */ js.Function1[/* error */ js.UndefOr[js.Error | Null], Unit], 
          Unit
        ]
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("final")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFinal: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("final")(js.undefined)
        ret
    }
    @scala.inline
    def withFlush(value: js.ThisFunction1[/* this */ Transform, /* callback */ TransformCallback, Unit]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flush")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFlush: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flush")(js.undefined)
        ret
    }
    @scala.inline
    def withHighWaterMark(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("highWaterMark")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHighWaterMark: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("highWaterMark")(js.undefined)
        ret
    }
    @scala.inline
    def withObjectMode(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("objectMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutObjectMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("objectMode")(js.undefined)
        ret
    }
    @scala.inline
    def withOpener(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("opener")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOpener: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("opener")(js.undefined)
        ret
    }
    @scala.inline
    def withRead(value: js.ThisFunction1[/* this */ Transform, /* size */ Double, Unit]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("read")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRead: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("read")(js.undefined)
        ret
    }
    @scala.inline
    def withReadableHighWaterMark(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("readableHighWaterMark")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReadableHighWaterMark: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("readableHighWaterMark")(js.undefined)
        ret
    }
    @scala.inline
    def withReadableObjectMode(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("readableObjectMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReadableObjectMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("readableObjectMode")(js.undefined)
        ret
    }
    @scala.inline
    def withReplacer(value: (/* key */ String, /* value */ js.Any) => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("replacer")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutReplacer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("replacer")(js.undefined)
        ret
    }
    @scala.inline
    def withSeperator(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("seperator")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSeperator: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("seperator")(js.undefined)
        ret
    }
    @scala.inline
    def withSpace(value: String | Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("space")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSpace: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("space")(js.undefined)
        ret
    }
    @scala.inline
    def withStringifier(value: (/* value */ js.Any, /* replacer */ Replacer, /* space */ String | Double) => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stringifier")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutStringifier: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stringifier")(js.undefined)
        ret
    }
    @scala.inline
    def withTransform(
      value: js.ThisFunction3[
          /* this */ Transform, 
          /* chunk */ js.Any, 
          /* encoding */ String, 
          /* callback */ TransformCallback, 
          Unit
        ]
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transform")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTransform: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transform")(js.undefined)
        ret
    }
    @scala.inline
    def withWritableCorked(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("writableCorked")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWritableCorked: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("writableCorked")(js.undefined)
        ret
    }
    @scala.inline
    def withWritableHighWaterMark(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("writableHighWaterMark")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWritableHighWaterMark: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("writableHighWaterMark")(js.undefined)
        ret
    }
    @scala.inline
    def withWritableObjectMode(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("writableObjectMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWritableObjectMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("writableObjectMode")(js.undefined)
        ret
    }
    @scala.inline
    def withWrite(
      value: js.ThisFunction3[
          /* this */ Transform, 
          /* chunk */ js.Any, 
          /* encoding */ String, 
          /* callback */ js.Function1[/* error */ js.UndefOr[js.Error | Null], Unit], 
          Unit
        ]
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("write")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWrite: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("write")(js.undefined)
        ret
    }
    @scala.inline
    def withWritev(
      value: js.ThisFunction2[
          /* this */ Transform, 
          /* chunks */ js.Array[Chunk], 
          /* callback */ js.Function1[/* error */ js.UndefOr[js.Error | Null], Unit], 
          Unit
        ]
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("writev")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWritev: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("writev")(js.undefined)
        ret
    }
  }
  
}

