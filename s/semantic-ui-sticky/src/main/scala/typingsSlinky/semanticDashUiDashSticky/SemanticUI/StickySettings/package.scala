package typingsSlinky.semanticDashUiDashSticky.SemanticUI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object StickySettings {
  import typingsSlinky.semanticDashUiDashSticky.semanticDashUiDashStickyStrings.bottomOffset
  import typingsSlinky.semanticDashUiDashSticky.semanticDashUiDashStickyStrings.className
  import typingsSlinky.semanticDashUiDashSticky.semanticDashUiDashStickyStrings.context
  import typingsSlinky.semanticDashUiDashSticky.semanticDashUiDashStickyStrings.debug
  import typingsSlinky.semanticDashUiDashSticky.semanticDashUiDashStickyStrings.error
  import typingsSlinky.semanticDashUiDashSticky.semanticDashUiDashStickyStrings.jitter
  import typingsSlinky.semanticDashUiDashSticky.semanticDashUiDashStickyStrings.name
  import typingsSlinky.semanticDashUiDashSticky.semanticDashUiDashStickyStrings.namespace
  import typingsSlinky.semanticDashUiDashSticky.semanticDashUiDashStickyStrings.observeChanges
  import typingsSlinky.semanticDashUiDashSticky.semanticDashUiDashStickyStrings.offset
  import typingsSlinky.semanticDashUiDashSticky.semanticDashUiDashStickyStrings.onBottom
  import typingsSlinky.semanticDashUiDashSticky.semanticDashUiDashStickyStrings.onReposition
  import typingsSlinky.semanticDashUiDashSticky.semanticDashUiDashStickyStrings.onScroll
  import typingsSlinky.semanticDashUiDashSticky.semanticDashUiDashStickyStrings.onStick
  import typingsSlinky.semanticDashUiDashSticky.semanticDashUiDashStickyStrings.onTop
  import typingsSlinky.semanticDashUiDashSticky.semanticDashUiDashStickyStrings.onUnstick
  import typingsSlinky.semanticDashUiDashSticky.semanticDashUiDashStickyStrings.performance
  import typingsSlinky.semanticDashUiDashSticky.semanticDashUiDashStickyStrings.pushing
  import typingsSlinky.semanticDashUiDashSticky.semanticDashUiDashStickyStrings.scrollContext
  import typingsSlinky.semanticDashUiDashSticky.semanticDashUiDashStickyStrings.setSize
  import typingsSlinky.semanticDashUiDashSticky.semanticDashUiDashStickyStrings.silent
  import typingsSlinky.semanticDashUiDashSticky.semanticDashUiDashStickyStrings.verbose
  import typingsSlinky.std.Partial
  import typingsSlinky.std.Pick

  type Param = (Pick[
    _Impl, 
    pushing | setSize | jitter | observeChanges | context | scrollContext | offset | bottomOffset | onReposition | onScroll | onStick | onUnstick | onTop | onBottom | className | error | namespace | name | silent | debug | performance | verbose
  ]) with (Partial[
    Pick[
      _Impl, 
      pushing | setSize | jitter | observeChanges | context | scrollContext | offset | bottomOffset | className | error | namespace | name | silent | debug | performance | verbose
    ]
  ])
}
