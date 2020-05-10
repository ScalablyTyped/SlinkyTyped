package typingsSlinky.xmlbuilder.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Defines the options used while creating an XML document with the `begin`
  * function.
  */
@js.native
trait BeginOptions extends js.Object {
  /** 
    * Whether decorator strings will be ignored when converting JS 
    * objects
    */
  var ignoreDecorators: js.UndefOr[Boolean] = js.native
  /**
    * Whether attributes with null values will be kept or ignored
    */
  var keepNullAttributes: js.UndefOr[Boolean] = js.native
  /**
    * Whether nodes with null values will be kept or ignored
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
    * Whether array items are created as separate nodes when passed 
    * as an object value
    */
  var separateArrayItems: js.UndefOr[Boolean] = js.native
  /**
    * A set of functions to use for converting values to strings
    */
  var stringify: js.UndefOr[XMLStringifier] = js.native
  /** 
    * The default XML writer to use for converting nodes to string. 
    * If the default writer is not set, the built-in XMLStringWriter 
    * will be used instead. 
    */
  var writer: js.UndefOr[XMLWriter | WriterOptions] = js.native
}

object BeginOptions {
  @scala.inline
  def apply(): BeginOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BeginOptions]
  }
  @scala.inline
  implicit class BeginOptionsOps[Self <: BeginOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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
    def withWriter(value: XMLWriter | WriterOptions): Self = {
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

