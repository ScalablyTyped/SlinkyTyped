package typingsSlinky.toJsonSchema

import typingsSlinky.toJsonSchema.mod.JSONSchema3or4
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonAdditionalProperties extends js.Object {
  /**
    * if set to `false`, all object schemas will include JSON schema
    * property `additionalProperties: false` which makes generated schema
    * to perevent any extra properties.
    *
    * @default true
    */
  var additionalProperties: js.UndefOr[Boolean] = js.native
  /**
    * By providing `postProcessFnc`, you can modify or replace generated
    * schema. This function will be called recursively for all the
    * properties and sub-properties and array items from leaves to the root
    * of the `obj` object.
    *
    * @param schema Generated JSON schema
    * @param obj input value
    * @param defaultFunc standard function that is used to post-process
    *                    generated schema. Takes the `schema`, `obj`
    *                    params.
    */
  var postProcessFnc: js.UndefOr[
    js.Function3[
      /* schema */ JSONSchema3or4, 
      /* obj */ js.Any, 
      /* defaultFnc */ js.Function2[/* schema */ JSONSchema3or4, /* obj */ js.Any, JSONSchema3or4], 
      JSONSchema3or4
    ]
  ] = js.native
  /**
    * By providing custom function you will be able to modify any object
    * value (including nested ones) and pre-process it before it gets
    * converted into schema or modify generated schema or do the schema
    * conversion entirely by yourself.
    *
    * @param obj input object value that is supposed to be converted into
    *            JSON schema
    * @param defaultFunc standard function that is used to generate schema
    *                    from object. Takes just the `obj` param.
    */
  var preProcessFnc: js.UndefOr[
    js.Function2[
      /* obj */ js.Any, 
      /* defaultFunc */ js.Function1[/* obj */ js.Any, JSONSchema3or4], 
      JSONSchema3or4
    ]
  ] = js.native
}

object AnonAdditionalProperties {
  @scala.inline
  def apply(): AnonAdditionalProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonAdditionalProperties]
  }
  @scala.inline
  implicit class AnonAdditionalPropertiesOps[Self <: AnonAdditionalProperties] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAdditionalProperties(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("additionalProperties")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAdditionalProperties: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("additionalProperties")(js.undefined)
        ret
    }
    @scala.inline
    def withPostProcessFnc(
      value: (/* schema */ JSONSchema3or4, /* obj */ js.Any, /* defaultFnc */ js.Function2[/* schema */ JSONSchema3or4, /* obj */ js.Any, JSONSchema3or4]) => JSONSchema3or4
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("postProcessFnc")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutPostProcessFnc: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("postProcessFnc")(js.undefined)
        ret
    }
    @scala.inline
    def withPreProcessFnc(
      value: (/* obj */ js.Any, /* defaultFunc */ js.Function1[/* obj */ js.Any, JSONSchema3or4]) => JSONSchema3or4
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preProcessFnc")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutPreProcessFnc: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preProcessFnc")(js.undefined)
        ret
    }
  }
  
}

