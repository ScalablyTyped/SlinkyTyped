package typingsSlinky.vis

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type HeightWidthType = typingsSlinky.vis.mod.IdType
  type MomentConstructor1 = js.Function3[
    /* inp */ js.UndefOr[typingsSlinky.moment.mod.MomentInput], 
    /* format */ js.UndefOr[typingsSlinky.moment.mod.MomentFormatSpecification], 
    /* strict */ js.UndefOr[scala.Boolean], 
    typingsSlinky.moment.mod.Moment
  ]
  type MomentConstructor2 = js.Function4[
    /* inp */ js.UndefOr[typingsSlinky.moment.mod.MomentInput], 
    /* format */ js.UndefOr[typingsSlinky.moment.mod.MomentFormatSpecification], 
    /* language */ js.UndefOr[java.lang.String], 
    /* strict */ js.UndefOr[scala.Boolean], 
    typingsSlinky.moment.mod.Moment
  ]
  type SubGroupStackOptions = org.scalablytyped.runtime.StringDictionary[scala.Boolean]
  type SubgroupType = typingsSlinky.vis.mod.IdType
  type TimelineFormatLabelsFunction = js.Function3[
    /* date */ js.Date, 
    /* scale */ java.lang.String, 
    /* step */ scala.Double, 
    java.lang.String
  ]
  type TimelineOptionsComparisonFunction = js.Function2[/* a */ js.Any, /* b */ js.Any, scala.Double]
  type TimelineOptionsConfigureFunction = js.Function2[/* option */ java.lang.String, /* path */ js.Array[java.lang.String], scala.Boolean]
  type TimelineOptionsGroupCallbackFunction = js.Function2[
    /* group */ typingsSlinky.vis.mod.TimelineGroup, 
    /* callback */ js.Function1[/* group */ typingsSlinky.vis.mod.TimelineGroup | scala.Null, scala.Unit], 
    scala.Unit
  ]
  type TimelineOptionsGroupOrderSwapFunction = js.Function3[
    /* fromGroup */ js.Any, 
    /* toGroup */ js.Any, 
    /* groups */ typingsSlinky.vis.mod.DataSet[typingsSlinky.vis.mod.DataGroup], 
    scala.Unit
  ]
  type TimelineOptionsItemCallbackFunction = js.Function2[
    /* item */ typingsSlinky.vis.mod.TimelineItem, 
    /* callback */ js.Function1[/* item */ typingsSlinky.vis.mod.TimelineItem | scala.Null, scala.Unit], 
    scala.Unit
  ]
  type TimelineOptionsSnapFunction = js.Function3[
    /* date */ js.Date, 
    /* scale */ java.lang.String, 
    /* step */ scala.Double, 
    js.Date | scala.Double
  ]
  type TimelineOptionsTemplateFunction = js.Function3[
    /* item */ js.UndefOr[js.Any], 
    /* element */ js.UndefOr[js.Any], 
    /* data */ js.UndefOr[js.Any], 
    java.lang.String
  ]
}
