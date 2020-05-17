package typingsSlinky.server.anon

import typingsSlinky.helmet.mod.IFeaturePolicyOptions
import typingsSlinky.helmet.mod.IHelmetContentSecurityPolicyConfiguration
import typingsSlinky.helmet.mod.IHelmetDnsPrefetchControlConfiguration
import typingsSlinky.helmet.mod.IHelmetExpectCtConfiguration
import typingsSlinky.helmet.mod.IHelmetFrameguardConfiguration
import typingsSlinky.helmet.mod.IHelmetHidePoweredByConfiguration
import typingsSlinky.helmet.mod.IHelmetHpkpConfiguration
import typingsSlinky.helmet.mod.IHelmetHstsConfiguration
import typingsSlinky.helmet.mod.IHelmetPermittedCrossDomainPoliciesConfiguration
import typingsSlinky.helmet.mod.IHelmetReferrerPolicyConfiguration
import typingsSlinky.helmet.mod.IHelmetXssFilterConfiguration
import typingsSlinky.server.optionsMod.CsurfOptions
import typingsSlinky.server.serverBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined helmet.helmet.IHelmetConfiguration & {  csurf ? :false | server.server/typings/options.CsurfOptions} */
@js.native
trait IHelmetConfigurationcsurf extends js.Object {
  var contentSecurityPolicy: js.UndefOr[Boolean | IHelmetContentSecurityPolicyConfiguration] = js.native
  var csurf: js.UndefOr[`false` | CsurfOptions] = js.native
  var dnsPrefetchControl: js.UndefOr[Boolean | IHelmetDnsPrefetchControlConfiguration] = js.native
  var expectCt: js.UndefOr[Boolean | IHelmetExpectCtConfiguration] = js.native
  var featurePolicy: js.UndefOr[IFeaturePolicyOptions] = js.native
  var frameguard: js.UndefOr[Boolean | IHelmetFrameguardConfiguration] = js.native
  var hidePoweredBy: js.UndefOr[Boolean | IHelmetHidePoweredByConfiguration] = js.native
  var hpkp: js.UndefOr[Boolean | IHelmetHpkpConfiguration] = js.native
  var hsts: js.UndefOr[Boolean | IHelmetHstsConfiguration] = js.native
  var ieNoOpen: js.UndefOr[Boolean] = js.native
  var noCache: js.UndefOr[Boolean] = js.native
  var noSniff: js.UndefOr[Boolean] = js.native
  var permittedCrossDomainPolicies: js.UndefOr[Boolean | IHelmetPermittedCrossDomainPoliciesConfiguration] = js.native
  var referrerPolicy: js.UndefOr[Boolean | IHelmetReferrerPolicyConfiguration] = js.native
  var xssFilter: js.UndefOr[Boolean | IHelmetXssFilterConfiguration] = js.native
}

object IHelmetConfigurationcsurf {
  @scala.inline
  def apply(): IHelmetConfigurationcsurf = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IHelmetConfigurationcsurf]
  }
  @scala.inline
  implicit class IHelmetConfigurationcsurfOps[Self <: IHelmetConfigurationcsurf] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withContentSecurityPolicy(value: Boolean | IHelmetContentSecurityPolicyConfiguration): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contentSecurityPolicy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContentSecurityPolicy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contentSecurityPolicy")(js.undefined)
        ret
    }
    @scala.inline
    def withCsurf(value: `false` | CsurfOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("csurf")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCsurf: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("csurf")(js.undefined)
        ret
    }
    @scala.inline
    def withDnsPrefetchControl(value: Boolean | IHelmetDnsPrefetchControlConfiguration): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dnsPrefetchControl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDnsPrefetchControl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dnsPrefetchControl")(js.undefined)
        ret
    }
    @scala.inline
    def withExpectCt(value: Boolean | IHelmetExpectCtConfiguration): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expectCt")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExpectCt: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expectCt")(js.undefined)
        ret
    }
    @scala.inline
    def withFeaturePolicy(value: IFeaturePolicyOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("featurePolicy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFeaturePolicy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("featurePolicy")(js.undefined)
        ret
    }
    @scala.inline
    def withFrameguard(value: Boolean | IHelmetFrameguardConfiguration): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("frameguard")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFrameguard: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("frameguard")(js.undefined)
        ret
    }
    @scala.inline
    def withHidePoweredBy(value: Boolean | IHelmetHidePoweredByConfiguration): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hidePoweredBy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHidePoweredBy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hidePoweredBy")(js.undefined)
        ret
    }
    @scala.inline
    def withHpkp(value: Boolean | IHelmetHpkpConfiguration): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hpkp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHpkp: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hpkp")(js.undefined)
        ret
    }
    @scala.inline
    def withHsts(value: Boolean | IHelmetHstsConfiguration): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hsts")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHsts: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hsts")(js.undefined)
        ret
    }
    @scala.inline
    def withIeNoOpen(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ieNoOpen")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIeNoOpen: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ieNoOpen")(js.undefined)
        ret
    }
    @scala.inline
    def withNoCache(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noCache")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNoCache: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noCache")(js.undefined)
        ret
    }
    @scala.inline
    def withNoSniff(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noSniff")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNoSniff: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noSniff")(js.undefined)
        ret
    }
    @scala.inline
    def withPermittedCrossDomainPolicies(value: Boolean | IHelmetPermittedCrossDomainPoliciesConfiguration): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("permittedCrossDomainPolicies")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPermittedCrossDomainPolicies: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("permittedCrossDomainPolicies")(js.undefined)
        ret
    }
    @scala.inline
    def withReferrerPolicy(value: Boolean | IHelmetReferrerPolicyConfiguration): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("referrerPolicy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReferrerPolicy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("referrerPolicy")(js.undefined)
        ret
    }
    @scala.inline
    def withXssFilter(value: Boolean | IHelmetXssFilterConfiguration): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xssFilter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutXssFilter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xssFilter")(js.undefined)
        ret
    }
  }
  
}

