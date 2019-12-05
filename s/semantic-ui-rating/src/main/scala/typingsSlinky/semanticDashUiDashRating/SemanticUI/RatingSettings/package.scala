package typingsSlinky.semanticDashUiDashRating.SemanticUI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object RatingSettings {
  import typingsSlinky.semanticDashUiDashRating.semanticDashUiDashRatingStrings.className
  import typingsSlinky.semanticDashUiDashRating.semanticDashUiDashRatingStrings.clearable
  import typingsSlinky.semanticDashUiDashRating.semanticDashUiDashRatingStrings.debug
  import typingsSlinky.semanticDashUiDashRating.semanticDashUiDashRatingStrings.error
  import typingsSlinky.semanticDashUiDashRating.semanticDashUiDashRatingStrings.fireOnInit
  import typingsSlinky.semanticDashUiDashRating.semanticDashUiDashRatingStrings.initialRating
  import typingsSlinky.semanticDashUiDashRating.semanticDashUiDashRatingStrings.interactive
  import typingsSlinky.semanticDashUiDashRating.semanticDashUiDashRatingStrings.name
  import typingsSlinky.semanticDashUiDashRating.semanticDashUiDashRatingStrings.namespace
  import typingsSlinky.semanticDashUiDashRating.semanticDashUiDashRatingStrings.onRate
  import typingsSlinky.semanticDashUiDashRating.semanticDashUiDashRatingStrings.performance
  import typingsSlinky.semanticDashUiDashRating.semanticDashUiDashRatingStrings.selector
  import typingsSlinky.semanticDashUiDashRating.semanticDashUiDashRatingStrings.silent
  import typingsSlinky.semanticDashUiDashRating.semanticDashUiDashRatingStrings.verbose
  import typingsSlinky.std.Partial
  import typingsSlinky.std.Pick

  type Param = (Pick[
    _Impl, 
    initialRating | fireOnInit | clearable | interactive | onRate | selector | className | error | namespace | name | silent | debug | performance | verbose
  ]) with (Partial[
    Pick[
      _Impl, 
      initialRating | fireOnInit | clearable | interactive | selector | className | error | namespace | name | silent | debug | performance | verbose
    ]
  ])
}
