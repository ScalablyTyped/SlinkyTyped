package typingsSlinky.xmlbuilder.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Defines the settings used when converting the XML document to string.
  */
@js.native
trait XMLToStringOptions extends js.Object {
  /**
    * Whether to output closing tags for empty element nodes
    */
  var allowEmpty: js.UndefOr[Boolean] = js.native
  /**
    * Whether to pretty print text nodes
    */
  var dontPrettyTextNodes: js.UndefOr[Boolean] = js.native
  /**
    * Indentation string for pretty printing
    */
  var indent: js.UndefOr[String] = js.native
  /**
    * Newline string for pretty printing
    */
  var newline: js.UndefOr[String] = js.native
  /**
    * A fixed number of indents to offset strings
    */
  var offset: js.UndefOr[Double] = js.native
  /**
    * Pretty print the XML tree
    */
  var pretty: js.UndefOr[Boolean] = js.native
  /**
    * A string to insert before closing slash character
    */
  var spaceBeforeSlash: js.UndefOr[String | Boolean] = js.native
  /**
    * Maximum column width
    */
  var width: js.UndefOr[Double] = js.native
  /** 
    * The default XML writer to use for converting nodes to string. 
    * If the default writer is not set, the built-in `XMLStringWriter` 
    * will be used instead. 
    */
  var writer: js.UndefOr[XMLWriter] = js.native
}

object XMLToStringOptions {
  @scala.inline
  def apply(): XMLToStringOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[XMLToStringOptions]
  }
  @scala.inline
  implicit class XMLToStringOptionsOps[Self <: XMLToStringOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAllowEmpty(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowEmpty")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowEmpty: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowEmpty")(js.undefined)
        ret
    }
    @scala.inline
    def withDontPrettyTextNodes(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dontPrettyTextNodes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDontPrettyTextNodes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dontPrettyTextNodes")(js.undefined)
        ret
    }
    @scala.inline
    def withIndent(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("indent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIndent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("indent")(js.undefined)
        ret
    }
    @scala.inline
    def withNewline(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newline")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNewline: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newline")(js.undefined)
        ret
    }
    @scala.inline
    def withOffset(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("offset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOffset: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("offset")(js.undefined)
        ret
    }
    @scala.inline
    def withPretty(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pretty")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPretty: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pretty")(js.undefined)
        ret
    }
    @scala.inline
    def withSpaceBeforeSlash(value: String | Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("spaceBeforeSlash")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSpaceBeforeSlash: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("spaceBeforeSlash")(js.undefined)
        ret
    }
    @scala.inline
    def withWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("width")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("width")(js.undefined)
        ret
    }
    @scala.inline
    def withWriter(value: XMLWriter): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("writer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWriter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("writer")(js.undefined)
        ret
    }
  }
  
}

