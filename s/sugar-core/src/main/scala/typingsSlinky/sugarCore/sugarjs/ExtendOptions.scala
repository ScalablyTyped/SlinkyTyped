package typingsSlinky.sugarCore.sugarjs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ExtendOptions extends js.Object {
  var enhance: js.UndefOr[Boolean] = js.native
  var enhanceArray: js.UndefOr[Boolean] = js.native
  var enhanceString: js.UndefOr[Boolean] = js.native
  var except: js.UndefOr[js.Array[java.lang.String | NativeConstructor]] = js.native
  var methods: js.UndefOr[js.Array[java.lang.String]] = js.native
  var namespaces: js.UndefOr[js.Array[NativeConstructor]] = js.native
  var objectPrototype: js.UndefOr[Boolean] = js.native
}

object ExtendOptions {
  @scala.inline
  def apply(): ExtendOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExtendOptions]
  }
  @scala.inline
  implicit class ExtendOptionsOps[Self <: ExtendOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEnhance(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enhance")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnhance: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enhance")(js.undefined)
        ret
    }
    @scala.inline
    def withEnhanceArray(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enhanceArray")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnhanceArray: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enhanceArray")(js.undefined)
        ret
    }
    @scala.inline
    def withEnhanceString(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enhanceString")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnhanceString: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enhanceString")(js.undefined)
        ret
    }
    @scala.inline
    def withExcept(value: js.Array[java.lang.String | NativeConstructor]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("except")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExcept: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("except")(js.undefined)
        ret
    }
    @scala.inline
    def withMethods(value: js.Array[java.lang.String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("methods")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMethods: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("methods")(js.undefined)
        ret
    }
    @scala.inline
    def withNamespaces(value: js.Array[NativeConstructor]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("namespaces")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNamespaces: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("namespaces")(js.undefined)
        ret
    }
    @scala.inline
    def withObjectPrototype(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("objectPrototype")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutObjectPrototype: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("objectPrototype")(js.undefined)
        ret
    }
  }
  
}

