package typingsSlinky.strongholdPayJs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  @scala.inline
  def HOST: /* "https://api.strongholdpay.com" */ java.lang.String = typingsSlinky.strongholdPayJs.mod.^.asInstanceOf[js.Dynamic].selectDynamic("HOST").asInstanceOf[/* "https://api.strongholdpay.com" */ java.lang.String]
  
  @scala.inline
  def Pay(options: typingsSlinky.strongholdPayJs.mod.global.Stronghold.ClientOptions): typingsSlinky.strongholdPayJs.mod.global.Stronghold.Client = typingsSlinky.strongholdPayJs.mod.^.asInstanceOf[js.Dynamic].applyDynamic("Pay")(options.asInstanceOf[js.Any]).asInstanceOf[typingsSlinky.strongholdPayJs.mod.global.Stronghold.Client]
  
  @scala.inline
  def frameForSrc(src: java.lang.String): typingsSlinky.jquery.JQuery[org.scalajs.dom.raw.HTMLElement] = typingsSlinky.strongholdPayJs.mod.^.asInstanceOf[js.Dynamic].applyDynamic("frameForSrc")(src.asInstanceOf[js.Any]).asInstanceOf[typingsSlinky.jquery.JQuery[org.scalajs.dom.raw.HTMLElement]]
  
  @scala.inline
  def getChargeQuery(): org.scalablytyped.runtime.StringDictionary[js.UndefOr[java.lang.String | scala.Double | scala.Boolean]] = typingsSlinky.strongholdPayJs.mod.^.asInstanceOf[js.Dynamic].applyDynamic("getChargeQuery")().asInstanceOf[org.scalablytyped.runtime.StringDictionary[js.UndefOr[java.lang.String | scala.Double | scala.Boolean]]]
  @scala.inline
  def getChargeQuery(charge: typingsSlinky.strongholdPayJs.mod.global.Stronghold.ChargeDropin): org.scalablytyped.runtime.StringDictionary[js.UndefOr[java.lang.String | scala.Double | scala.Boolean]] = typingsSlinky.strongholdPayJs.mod.^.asInstanceOf[js.Dynamic].applyDynamic("getChargeQuery")(charge.asInstanceOf[js.Any]).asInstanceOf[org.scalablytyped.runtime.StringDictionary[js.UndefOr[java.lang.String | scala.Double | scala.Boolean]]]
  
  @scala.inline
  def getOptionQuery(options: typingsSlinky.strongholdPayJs.mod.global.Stronghold.Options): org.scalablytyped.runtime.StringDictionary[js.UndefOr[java.lang.String | scala.Double | scala.Boolean]] = typingsSlinky.strongholdPayJs.mod.^.asInstanceOf[js.Dynamic].applyDynamic("getOptionQuery")(options.asInstanceOf[js.Any]).asInstanceOf[org.scalablytyped.runtime.StringDictionary[js.UndefOr[java.lang.String | scala.Double | scala.Boolean]]]
  
  @scala.inline
  def getTipQuery(): org.scalablytyped.runtime.StringDictionary[js.UndefOr[java.lang.String | scala.Double | scala.Boolean]] = typingsSlinky.strongholdPayJs.mod.^.asInstanceOf[js.Dynamic].applyDynamic("getTipQuery")().asInstanceOf[org.scalablytyped.runtime.StringDictionary[js.UndefOr[java.lang.String | scala.Double | scala.Boolean]]]
  @scala.inline
  def getTipQuery(tip: typingsSlinky.strongholdPayJs.mod.global.Stronghold.TipDataDropin): org.scalablytyped.runtime.StringDictionary[js.UndefOr[java.lang.String | scala.Double | scala.Boolean]] = typingsSlinky.strongholdPayJs.mod.^.asInstanceOf[js.Dynamic].applyDynamic("getTipQuery")(tip.asInstanceOf[js.Any]).asInstanceOf[org.scalablytyped.runtime.StringDictionary[js.UndefOr[java.lang.String | scala.Double | scala.Boolean]]]
  @scala.inline
  def getTipQuery(tip: typingsSlinky.strongholdPayJs.mod.global.Stronghold.TipDropin): org.scalablytyped.runtime.StringDictionary[js.UndefOr[java.lang.String | scala.Double | scala.Boolean]] = typingsSlinky.strongholdPayJs.mod.^.asInstanceOf[js.Dynamic].applyDynamic("getTipQuery")(tip.asInstanceOf[js.Any]).asInstanceOf[org.scalablytyped.runtime.StringDictionary[js.UndefOr[java.lang.String | scala.Double | scala.Boolean]]]
}
