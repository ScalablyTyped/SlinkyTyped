package typingsSlinky.webgme.GmeClasses

import typingsSlinky.webgme.anon.Members
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MetaSetParameters extends js.Object {
  /**
    * if true, 
    * the query tries to filter out even 
    * more nodes according to the multiplicity rules 
    * (the default value is false, 
    * the check is only meaningful if all the children were passed)
    */
  var multiplicity: js.UndefOr[Boolean] = js.native
  /** the input parameters of the query. */
  var `object`: Members = js.native
  /** 
    * if true, the query filters out the 
    * abstract and connection-like nodes 
    * (the default value is false) 
    */
  var sensitive: js.UndefOr[Boolean] = js.native
}

object MetaSetParameters {
  @scala.inline
  def apply(`object`: Members): MetaSetParameters = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.asInstanceOf[MetaSetParameters]
  }
  @scala.inline
  implicit class MetaSetParametersOps[Self <: MetaSetParameters] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withObject(value: Members): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("object")(value.asInstanceOf[js.Any])
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

