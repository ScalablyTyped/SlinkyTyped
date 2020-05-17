package typingsSlinky.webgme.GmeClasses

import typingsSlinky.webgme.anon.Children
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MetaNodeParameters extends js.Object {
  /**
    * if given, 
    * the query filters to contain only types 
    * that are visible in the given aspect.
    */
  var aspect: js.UndefOr[String] = js.native
  /**
    * if true, 
    * the query tries to filter out even 
    * more nodes according to the multiplicity rules 
    * (the default value is false, 
    * the check is only meaningful if all the children were passed)
    */
  var multiplicity: js.UndefOr[Boolean] = js.native
  /** the input parameters of the query. */
  var `object`: Children = js.native
  /** 
    * if true, the query filters out the 
    * abstract and connection-like nodes 
    * (the default value is false) 
    */
  var sensitive: js.UndefOr[Boolean] = js.native
}

object MetaNodeParameters {
  @scala.inline
  def apply(`object`: Children): MetaNodeParameters = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.asInstanceOf[MetaNodeParameters]
  }
  @scala.inline
  implicit class MetaNodeParametersOps[Self <: MetaNodeParameters] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withObject(value: Children): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("object")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAspect(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aspect")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAspect: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aspect")(js.undefined)
        ret
    }
    @scala.inline
    def withMultiplicity(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("multiplicity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMultiplicity: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("multiplicity")(js.undefined)
        ret
    }
    @scala.inline
    def withSensitive(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sensitive")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSensitive: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sensitive")(js.undefined)
        ret
    }
  }
  
}

