package typingsSlinky.webpack.mod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.webpack.webpackStrings.empty
import typingsSlinky.webpack.webpackStrings.mock
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Node
  extends /* nodeBuiltin */ StringDictionary[js.UndefOr[Boolean | mock | empty]] {
  var Buffer: js.UndefOr[Boolean | mock] = js.native
  var __dirname: js.UndefOr[Boolean | mock] = js.native
  var __filename: js.UndefOr[Boolean | mock] = js.native
  var console: js.UndefOr[Boolean | mock] = js.native
  var global: js.UndefOr[Boolean] = js.native
  var process: js.UndefOr[Boolean | mock] = js.native
  var setImmediate: js.UndefOr[Boolean | mock | empty] = js.native
}

object Node {
  @scala.inline
  def apply(): Node = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Node]
  }
  @scala.inline
  implicit class NodeOps[Self <: Node] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBuffer(value: Boolean | mock): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Buffer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBuffer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Buffer")(js.undefined)
        ret
    }
    @scala.inline
    def with__dirname(value: Boolean | mock): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("__dirname")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without__dirname: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("__dirname")(js.undefined)
        ret
    }
    @scala.inline
    def with__filename(value: Boolean | mock): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("__filename")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without__filename: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("__filename")(js.undefined)
        ret
    }
    @scala.inline
    def withConsole(value: Boolean | mock): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("console")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConsole: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("console")(js.undefined)
        ret
    }
    @scala.inline
    def withGlobal(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("global")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGlobal: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("global")(js.undefined)
        ret
    }
    @scala.inline
    def withProcess(value: Boolean | mock): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("process")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProcess: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("process")(js.undefined)
        ret
    }
    @scala.inline
    def withSetImmediate(value: Boolean | mock | empty): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setImmediate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSetImmediate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setImmediate")(js.undefined)
        ret
    }
  }
  
}

