package typingsSlinky.shopifyPrime.scriptTagMod

import typingsSlinky.shopifyPrime.baseMod.ShopifyObject
import typingsSlinky.shopifyPrime.scriptTagDisplayScopeMod.ScriptTagDisplayScope
import typingsSlinky.shopifyPrime.shopifyPrimeStrings.onload
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ScriptTag extends ShopifyObject {
  /**
    * The date and time the script tag was created.
    */
  var created_at: js.UndefOr[String] = js.native
  /**
    * Where the script tag should be included on the store. Known values are 'online_store', 'order_status' or 'all'. Defaults to 'all'.
    */
  var display_scope: js.UndefOr[ScriptTagDisplayScope] = js.native
  /**
    * DOM event which triggers the loading of the script. Currently, 'onload' is the only accepted value.
    */
  var event: js.UndefOr[onload] = js.native
  /**
    * Specifies the src of the script tag, i.e. which URL to load it from.
    */
  var src: String = js.native
  /**
    * The date and time the script tag was updated.
    */
  var updated_at: js.UndefOr[String] = js.native
}

object ScriptTag {
  @scala.inline
  def apply(src: String): ScriptTag = {
    val __obj = js.Dynamic.literal(src = src.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScriptTag]
  }
  @scala.inline
  implicit class ScriptTagOps[Self <: ScriptTag] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSrc(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("src")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCreated_at(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("created_at")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCreated_at: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("created_at")(js.undefined)
        ret
    }
    @scala.inline
    def withDisplay_scope(value: ScriptTagDisplayScope): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("display_scope")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisplay_scope: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("display_scope")(js.undefined)
        ret
    }
    @scala.inline
    def withEvent(value: onload): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("event")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEvent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("event")(js.undefined)
        ret
    }
    @scala.inline
    def withUpdated_at(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updated_at")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUpdated_at: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updated_at")(js.undefined)
        ret
    }
  }
  
}

