package typingsSlinky.seamlessDashImmutable.seamlessDashImmutableMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object ImmutableDate {
  import typingsSlinky.seamlessDashImmutable.seamlessDashImmutableMod.Omit
  import typingsSlinky.seamlessDashImmutable.seamlessDashImmutableStrings.setDate
  import typingsSlinky.seamlessDashImmutable.seamlessDashImmutableStrings.setFullYear
  import typingsSlinky.seamlessDashImmutable.seamlessDashImmutableStrings.setHours
  import typingsSlinky.seamlessDashImmutable.seamlessDashImmutableStrings.setMilliseconds
  import typingsSlinky.seamlessDashImmutable.seamlessDashImmutableStrings.setMinutes
  import typingsSlinky.seamlessDashImmutable.seamlessDashImmutableStrings.setMonth
  import typingsSlinky.seamlessDashImmutable.seamlessDashImmutableStrings.setSeconds
  import typingsSlinky.seamlessDashImmutable.seamlessDashImmutableStrings.setTime
  import typingsSlinky.seamlessDashImmutable.seamlessDashImmutableStrings.setUTCDate
  import typingsSlinky.seamlessDashImmutable.seamlessDashImmutableStrings.setUTCFullYear
  import typingsSlinky.seamlessDashImmutable.seamlessDashImmutableStrings.setUTCHours
  import typingsSlinky.seamlessDashImmutable.seamlessDashImmutableStrings.setUTCMilliseconds
  import typingsSlinky.seamlessDashImmutable.seamlessDashImmutableStrings.setUTCMinutes
  import typingsSlinky.seamlessDashImmutable.seamlessDashImmutableStrings.setUTCMonth
  import typingsSlinky.seamlessDashImmutable.seamlessDashImmutableStrings.setUTCSeconds
  import typingsSlinky.seamlessDashImmutable.seamlessDashImmutableStrings.setYear
  import typingsSlinky.std.Extract

  // These methods are banned by seamless-immutable
  type MutatingDateMethods = Extract[
    String, 
    setDate | setFullYear | setHours | setMilliseconds | setMinutes | setMonth | setSeconds | setTime | setUTCDate | setUTCFullYear | setUTCHours | setUTCMilliseconds | setUTCMinutes | setUTCMonth | setUTCSeconds | setYear
  ]
  /** Only allows Date methods, which are the getters. */
  type Remaining = Omit[js.Date, MutatingDateMethods]
}
