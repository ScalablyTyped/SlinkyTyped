package typingsSlinky.vegaTypings.runtimeMod

import typingsSlinky.vegaTypings.anon.Ast
import typingsSlinky.vegaTypings.configMod.Config
import typingsSlinky.vegaTypings.specMod.Spec
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("vega-typings/types/runtime", "parse")
@js.native
object parse extends js.Object {
  
  def apply(spec: Spec): Runtime = js.native
  def apply(spec: Spec, config: js.UndefOr[scala.Nothing], opt: Ast): Runtime = js.native
  def apply(spec: Spec, config: Config): Runtime = js.native
  def apply(spec: Spec, config: Config, opt: Ast): Runtime = js.native
}
