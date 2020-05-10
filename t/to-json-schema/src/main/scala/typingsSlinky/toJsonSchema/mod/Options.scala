package typingsSlinky.toJsonSchema.mod

import typingsSlinky.jsonSchema.mod.JSONSchema4TypeName
import typingsSlinky.toJsonSchema.AnonAdditionalProperties
import typingsSlinky.toJsonSchema.AnonDetectFormat
import typingsSlinky.toJsonSchema.AnonMode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options extends js.Object {
  var arrays: js.UndefOr[AnonMode] = js.native
  var objects: js.UndefOr[AnonAdditionalProperties] = js.native
  /**
    * By providing `postProcessFnc`, you can modify or replace generated
    * schema. This function will be called recursively for all the properties
    * and sub-properties and array items from leaves to the root. If you want
    * to preserve default functionality, don't forget to call defaultFunc
    * which is currently responsible for setting `required` for the schema
    * items if there is common option `required` set to true.
    *
    * @param type JSON schema type of the `value`
    * @param schema Generated JSON schema
    * @param value - input value
    * @param defaultFunc standard function that is used to post-process
    *                    generated schema. Takes the `type`, `schema`,
    *                    `value` params.
    */
  var postProcessFnc: js.UndefOr[
    js.Function4[
      /* type */ JSONSchema4TypeName, 
      /* schema */ JSONSchema3or4, 
      /* value */ js.Any, 
      /* defaultFunc */ js.Function3[
        /* type */ JSONSchema4TypeName, 
        /* schema */ JSONSchema3or4, 
        /* value */ js.Any, 
        JSONSchema3or4
      ], 
      JSONSchema3or4
    ]
  ] = js.native
  /**
    * specify `true` to make all properties required.
    *
    * @default false
    * @example
    * const schema = toJsonSchema(33, {required: false});
    * // { type: "integer" }
    * const schema = toJsonSchema(33, {required: true});
    * // { type: "integer", "required": true }
    */
  var required: js.UndefOr[Boolean] = js.native
  var strings: js.UndefOr[AnonDetectFormat] = js.native
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
    def withArrays(value: AnonMode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("arrays")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutArrays: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("arrays")(js.undefined)
        ret
    }
    @scala.inline
    def withObjects(value: AnonAdditionalProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("objects")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutObjects: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("objects")(js.undefined)
        ret
    }
    @scala.inline
    def withPostProcessFnc(
      value: (/* type */ JSONSchema4TypeName, /* schema */ JSONSchema3or4, /* value */ js.Any, /* defaultFunc */ js.Function3[
          /* type */ JSONSchema4TypeName, 
          /* schema */ JSONSchema3or4, 
          /* value */ js.Any, 
          JSONSchema3or4
        ]) => JSONSchema3or4
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("postProcessFnc")(js.Any.fromFunction4(value))
        ret
    }
    @scala.inline
    def withoutPostProcessFnc: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("postProcessFnc")(js.undefined)
        ret
    }
    @scala.inline
    def withRequired(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("required")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRequired: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("required")(js.undefined)
        ret
    }
    @scala.inline
    def withStrings(value: AnonDetectFormat): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("strings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStrings: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("strings")(js.undefined)
        ret
    }
  }
  
}

