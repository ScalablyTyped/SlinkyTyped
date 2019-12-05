package typingsSlinky.semanticDashUiDashShape.SemanticUI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object ShapeSettings {
  import typingsSlinky.semanticDashUiDashShape.semanticDashUiDashShapeStrings.beforeChange
  import typingsSlinky.semanticDashUiDashShape.semanticDashUiDashShapeStrings.className
  import typingsSlinky.semanticDashUiDashShape.semanticDashUiDashShapeStrings.debug
  import typingsSlinky.semanticDashUiDashShape.semanticDashUiDashShapeStrings.duration
  import typingsSlinky.semanticDashUiDashShape.semanticDashUiDashShapeStrings.error
  import typingsSlinky.semanticDashUiDashShape.semanticDashUiDashShapeStrings.height
  import typingsSlinky.semanticDashUiDashShape.semanticDashUiDashShapeStrings.name
  import typingsSlinky.semanticDashUiDashShape.semanticDashUiDashShapeStrings.namespace
  import typingsSlinky.semanticDashUiDashShape.semanticDashUiDashShapeStrings.onChange
  import typingsSlinky.semanticDashUiDashShape.semanticDashUiDashShapeStrings.performance
  import typingsSlinky.semanticDashUiDashShape.semanticDashUiDashShapeStrings.selector
  import typingsSlinky.semanticDashUiDashShape.semanticDashUiDashShapeStrings.silent
  import typingsSlinky.semanticDashUiDashShape.semanticDashUiDashShapeStrings.verbose
  import typingsSlinky.semanticDashUiDashShape.semanticDashUiDashShapeStrings.width
  import typingsSlinky.std.Partial
  import typingsSlinky.std.Pick

  type Param = (Pick[
    _Impl, 
    duration | width | height | beforeChange | onChange | selector | className | error | namespace | name | silent | debug | performance | verbose
  ]) with (Partial[
    Pick[
      _Impl, 
      duration | width | height | selector | className | error | namespace | name | silent | debug | performance | verbose
    ]
  ])
}
