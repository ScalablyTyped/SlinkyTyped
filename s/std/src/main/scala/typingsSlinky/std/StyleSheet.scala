package typingsSlinky.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** A single style sheet. CSS style sheets will further implement the more specialized CSSStyleSheet interface. */
@js.native
trait StyleSheet extends js.Object {
  var disabled: scala.Boolean = js.native
  val href: java.lang.String | Null = js.native
  val media: org.scalajs.dom.raw.MediaList = js.native
  val ownerNode: org.scalajs.dom.raw.Node = js.native
  val parentStyleSheet: org.scalajs.dom.raw.StyleSheet | Null = js.native
  val title: java.lang.String | Null = js.native
  val `type`: java.lang.String = js.native
}

object StyleSheet {
  @scala.inline
  def apply(
    disabled: scala.Boolean,
    media: org.scalajs.dom.raw.MediaList,
    ownerNode: org.scalajs.dom.raw.Node,
    `type`: java.lang.String
  ): StyleSheet = {
    val __obj = js.Dynamic.literal(disabled = disabled.asInstanceOf[js.Any], media = media.asInstanceOf[js.Any], ownerNode = ownerNode.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[StyleSheet]
  }
  @scala.inline
  implicit class StyleSheetOps[Self <: org.scalajs.dom.raw.StyleSheet] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDisabled(value: scala.Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMedia(value: org.scalajs.dom.raw.MediaList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("media")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOwnerNode(value: org.scalajs.dom.raw.Node): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ownerNode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: java.lang.String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHref(value: java.lang.String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("href")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHrefNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("href")(null)
        ret
    }
    @scala.inline
    def withParentStyleSheet(value: org.scalajs.dom.raw.StyleSheet): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parentStyleSheet")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withParentStyleSheetNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parentStyleSheet")(null)
        ret
    }
    @scala.inline
    def withTitle(value: java.lang.String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTitleNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(null)
        ret
    }
  }
  
}

