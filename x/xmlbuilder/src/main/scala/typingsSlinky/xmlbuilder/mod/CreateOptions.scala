package typingsSlinky.xmlbuilder.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Defines the options used while creating an XML document with the `create`
  * function.
  */
@js.native
trait CreateOptions extends js.Object {
  /**
    * Encoding declaration, e.g. `UTF-8`
    */
  var encoding: js.UndefOr[String] = js.native
  /**
    * Whether XML declaration and doctype will be included
    */
  var headless: js.UndefOr[Boolean] = js.native
  /** 
    * Whether decorator strings will be ignored when converting JS 
    * objects
    */
  var ignoreDecorators: js.UndefOr[Boolean] = js.native
  /**
    * Whether attributes with `null` values will be kept or ignored
    */
  var keepNullAttributes: js.UndefOr[Boolean] = js.native
  /**
    * Whether nodes with `null` values will be kept or ignored
    */
  var keepNullNodes: js.UndefOr[Boolean] = js.native
  /**
    * Whether existing html entities are encoded
    */
  var noDoubleEncoding: js.UndefOr[Boolean] = js.native
  /**
    * Whether values will be validated and escaped or returned as is
    */
  var noValidation: js.UndefOr[Boolean] = js.native
  /**
    * Public identifier of the DTD
    */
  var pubID: js.UndefOr[String] = js.native
  /** 
    * Whether array items are created as separate nodes when passed 
    * as an object value
    */
  var separateArrayItems: js.UndefOr[Boolean] = js.native
  /**
    * Standalone document declaration: `true` or `false`
    */
  var standalone: js.UndefOr[Boolean] = js.native
  /**
    * A set of functions to use for converting values to strings
    */
  var stringify: js.UndefOr[XMLStringifier] = js.native
  /**
    * System identifier of the DTD
    */
  var sysID: js.UndefOr[String] = js.native
  /**
    * A version number string, e.g. `1.0`
    */
  var version: js.UndefOr[String] = js.native
  /** 
    * The default XML writer to use for converting nodes to string. 
    * If the default writer is not set, the built-in `XMLStringWriter` 
    * will be used instead. 
    */
  var writer: js.UndefOr[XMLWriter] = js.native
}

object CreateOptions {
  @scala.inline
  def apply(): CreateOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateOptions]
  }
  @scala.inline
  implicit class CreateOptionsOps[Self <: CreateOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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
    def withHeadless(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headless")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeadless: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headless")(js.undefined)
        ret
    }
    @scala.inline
    def withIgnoreDecorators(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignoreDecorators")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIgnoreDecorators: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignoreDecorators")(js.undefined)
        ret
    }
    @scala.inline
    def withKeepNullAttributes(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keepNullAttributes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKeepNullAttributes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keepNullAttributes")(js.undefined)
        ret
    }
    @scala.inline
    def withKeepNullNodes(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keepNullNodes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKeepNullNodes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keepNullNodes")(js.undefined)
        ret
    }
    @scala.inline
    def withNoDoubleEncoding(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noDoubleEncoding")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNoDoubleEncoding: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noDoubleEncoding")(js.undefined)
        ret
    }
    @scala.inline
    def withNoValidation(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noValidation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNoValidation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noValidation")(js.undefined)
        ret
    }
    @scala.inline
    def withPubID(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pubID")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPubID: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pubID")(js.undefined)
        ret
    }
    @scala.inline
    def withSeparateArrayItems(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("separateArrayItems")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSeparateArrayItems: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("separateArrayItems")(js.undefined)
        ret
    }
    @scala.inline
    def withStandalone(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("standalone")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStandalone: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("standalone")(js.undefined)
        ret
    }
    @scala.inline
    def withStringify(value: XMLStringifier): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stringify")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStringify: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stringify")(js.undefined)
        ret
    }
    @scala.inline
    def withSysID(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sysID")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSysID: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sysID")(js.undefined)
        ret
    }
    @scala.inline
    def withVersion(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("version")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVersion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("version")(js.undefined)
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

