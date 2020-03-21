package typingsSlinky.vis

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type DataGroupCollectionType = js.Array[typingsSlinky.vis.mod.DataGroup] | typingsSlinky.vis.mod.DataSet[typingsSlinky.vis.mod.DataGroup] | typingsSlinky.vis.mod.DataView[typingsSlinky.vis.mod.DataGroup]
  type DataItemCollectionType = js.Array[typingsSlinky.vis.mod.DataItem] | typingsSlinky.vis.mod.DataSet[typingsSlinky.vis.mod.DataItem] | typingsSlinky.vis.mod.DataView[typingsSlinky.vis.mod.DataItem]
  type DateType = js.Date | scala.Double | java.lang.String
  type Graph2dLegendOption = scala.Boolean | typingsSlinky.vis.mod.LegendOptions
  type Graph2dOptionBarChart = scala.Double | typingsSlinky.vis.mod.Graph2dBarChartOption
  type Graph2dOptionDataAxis = scala.Boolean | typingsSlinky.vis.mod.Graph2dDataAxisOption
  type Graph2dOptionDrawPoints = scala.Boolean | typingsSlinky.vis.mod.Graph2dDrawPointsOption
  type HeightWidthType = typingsSlinky.vis.mod.IdType
  type IdType = java.lang.String | scala.Double
  type MomentConstructor = typingsSlinky.vis.mod.MomentConstructor1 | typingsSlinky.vis.mod.MomentConstructor2
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
  type TimelineAnimationType = scala.Boolean | typingsSlinky.vis.mod.AnimationOptions
  type TimelineFormatLabelsFunction = js.Function3[
    /* date */ js.Date, 
    /* scale */ java.lang.String, 
    /* step */ scala.Double, 
    java.lang.String
  ]
  type TimelineItemEditableType = scala.Boolean | typingsSlinky.vis.mod.TimelineItemEditableOption
  type TimelineMarginItemType = scala.Double | typingsSlinky.vis.mod.TimelineMarginItem
  type TimelineOptionsComparisonFunction = js.Function2[/* a */ js.Any, /* b */ js.Any, scala.Double]
  type TimelineOptionsConfigureFunction = js.Function2[/* option */ java.lang.String, /* path */ js.Array[java.lang.String], scala.Boolean]
  type TimelineOptionsConfigureType = scala.Boolean | typingsSlinky.vis.mod.TimelineOptionsConfigureFunction
  type TimelineOptionsDataAttributesType = scala.Boolean | java.lang.String | js.Array[java.lang.String]
  type TimelineOptionsEditableType = scala.Boolean | typingsSlinky.vis.mod.TimelineEditableOption
  type TimelineOptionsGroupCallbackFunction = js.Function2[
    /* group */ typingsSlinky.vis.mod.TimelineGroup, 
    /* callback */ js.Function1[/* group */ typingsSlinky.vis.mod.TimelineGroup | scala.Null, scala.Unit], 
    scala.Unit
  ]
  type TimelineOptionsGroupEditableType = scala.Boolean | typingsSlinky.vis.mod.TimelineGroupEditableOption
  type TimelineOptionsGroupOrderSwapFunction = js.Function3[
    /* fromGroup */ js.Any, 
    /* toGroup */ js.Any, 
    /* groups */ typingsSlinky.vis.mod.DataSet[typingsSlinky.vis.mod.DataGroup], 
    scala.Unit
  ]
  type TimelineOptionsGroupOrderType = java.lang.String | typingsSlinky.vis.mod.TimelineOptionsComparisonFunction
  type TimelineOptionsHiddenDatesType = typingsSlinky.vis.mod.TimelineHiddenDateOption | js.Array[typingsSlinky.vis.mod.TimelineHiddenDateOption]
  type TimelineOptionsItemCallbackFunction = js.Function2[
    /* item */ typingsSlinky.vis.mod.TimelineItem, 
    /* callback */ js.Function1[/* item */ typingsSlinky.vis.mod.TimelineItem | scala.Null, scala.Unit], 
    scala.Unit
  ]
  type TimelineOptionsItemsAlwaysDraggableType = scala.Boolean | typingsSlinky.vis.mod.TimelineItemsAlwaysDraggableOption
  type TimelineOptionsMarginType = scala.Double | typingsSlinky.vis.mod.TimelineMarginOption
  type TimelineOptionsOrientationType = java.lang.String | typingsSlinky.vis.mod.TimelineOrientationOption
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
