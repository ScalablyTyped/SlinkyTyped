package typingsSlinky.tmiDotJs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object tmiDotJsMod {
  import org.scalablytyped.runtime.StringDictionary
  import typingsSlinky.std.Exclude
  import typingsSlinky.tmiDotJs.Anon_Code
  import typingsSlinky.tmiDotJs.strictDashEventDashEmitterDashTypesMod.OverriddenKeys
  import typingsSlinky.tmiDotJs.strictDashEventDashEmitterDashTypesMod.StrictEventEmitter

  type Client = (StrictEventEmitter[
    ClientBase, 
    Events, 
    Events, 
    Exclude[OverriddenKeys, String], 
    Exclude[OverriddenKeys, Exclude[OverriddenKeys, String]]
  ]) with Actions
  type EmoteObj = StringDictionary[js.Array[Anon_Code]]
}
