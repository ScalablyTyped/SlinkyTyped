package typingsSlinky.titanium.Titanium

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object UI {
  /**
    * Fired when the view element gains focus.
    */
  type ActivityIndicatorFocusEvent = typingsSlinky.titanium.Titanium.UI.ActivityIndicatorBaseEvent
  /**
    * Fired when the device detects a long click.
    */
  type ActivityIndicatorLongclickEvent = typingsSlinky.titanium.Titanium.UI.ActivityIndicatorBaseEvent
  /**
    * Fired when a layout cycle is finished.
    */
  type ActivityIndicatorPostlayoutEvent = typingsSlinky.titanium.Titanium.UI.ActivityIndicatorBaseEvent
  /**
    * A set of constants for the styles available for <Titanium.UI.ActivityIndicator> objects.
    */
  type ActivityIndicatorStyle = typingsSlinky.titanium.Titanium.Module
  /**
    * Fired when the view element gains focus.
    */
  type AlertDialogFocusEvent = typingsSlinky.titanium.Titanium.UI.AlertDialogBaseEvent
  /**
    * Fired when the device detects a long click.
    */
  type AlertDialogLongclickEvent = typingsSlinky.titanium.Titanium.UI.AlertDialogBaseEvent
  /**
    * Fired when a layout cycle is finished.
    */
  type AlertDialogPostlayoutEvent = typingsSlinky.titanium.Titanium.UI.AlertDialogBaseEvent
  /**
    * The Android-specific UI capabilities. All properties, methods and events in this namespace will
    * only work on Android systems.
    */
  type Android = typingsSlinky.titanium.Titanium.Module
  /**
    * Fired when the animation completes.
    */
  type AnimationCompleteEvent = typingsSlinky.titanium.Titanium.UI.AnimationBaseEvent
  /**
    * Fired when the animation starts.
    */
  type AnimationStartEvent = typingsSlinky.titanium.Titanium.UI.AnimationBaseEvent
  /**
    * Fired when a layout cycle is finished.
    */
  type ButtonBarPostlayoutEvent = typingsSlinky.titanium.Titanium.UI.ButtonBarBaseEvent
  /**
    * Fired when the view element gains focus.
    */
  type ButtonFocusEvent = typingsSlinky.titanium.Titanium.UI.ButtonBaseEvent
  /**
    * Fired when the device detects a long click.
    */
  type ButtonLongclickEvent = typingsSlinky.titanium.Titanium.UI.ButtonBaseEvent
  /**
    * Fired when a layout cycle is finished.
    */
  type ButtonPostlayoutEvent = typingsSlinky.titanium.Titanium.UI.ButtonBaseEvent
  /**
    * A module used for accessing clipboard data.
    */
  type Clipboard = typingsSlinky.titanium.Titanium.Module
  /**
    * Fired when edit mode ends.
    */
  type DashboardViewCommitEvent = typingsSlinky.titanium.Titanium.UI.DashboardViewBaseEvent
  /**
    * Fired when edit mode starts.
    */
  type DashboardViewEditEvent = typingsSlinky.titanium.Titanium.UI.DashboardViewBaseEvent
  /**
    * Fired when a layout cycle is finished.
    */
  type DashboardViewPostlayoutEvent = typingsSlinky.titanium.Titanium.UI.DashboardViewBaseEvent
  /**
    * Fired when the view element gains focus.
    */
  type EmailDialogFocusEvent = typingsSlinky.titanium.Titanium.UI.EmailDialogBaseEvent
  /**
    * Fired when the device detects a long click.
    */
  type EmailDialogLongclickEvent = typingsSlinky.titanium.Titanium.UI.EmailDialogBaseEvent
  /**
    * Fired when a layout cycle is finished.
    */
  type EmailDialogPostlayoutEvent = typingsSlinky.titanium.Titanium.UI.EmailDialogBaseEvent
  /**
    * Fired when the view element gains focus.
    */
  type ImageViewFocusEvent = typingsSlinky.titanium.Titanium.UI.ImageViewBaseEvent
  /**
    * Fired when the device detects a long click.
    */
  type ImageViewLongclickEvent = typingsSlinky.titanium.Titanium.UI.ImageViewBaseEvent
  /**
    * Fired when the animation pauses.
    */
  type ImageViewPauseEvent = typingsSlinky.titanium.Titanium.UI.ImageViewBaseEvent
  /**
    * Fired when a layout cycle is finished.
    */
  type ImageViewPostlayoutEvent = typingsSlinky.titanium.Titanium.UI.ImageViewBaseEvent
  /**
    * Fired when the animation starts.
    */
  type ImageViewStartEvent = typingsSlinky.titanium.Titanium.UI.ImageViewBaseEvent
  /**
    * Fired when the animation stops.
    */
  type ImageViewStopEvent = typingsSlinky.titanium.Titanium.UI.ImageViewBaseEvent
  /**
    * Fired when the view element gains focus.
    */
  type LabelFocusEvent = typingsSlinky.titanium.Titanium.UI.LabelBaseEvent
  /**
    * Fired when the device detects a long click.
    */
  type LabelLongclickEvent = typingsSlinky.titanium.Titanium.UI.LabelBaseEvent
  /**
    * Fired when a layout cycle is finished.
    */
  type LabelPostlayoutEvent = typingsSlinky.titanium.Titanium.UI.LabelBaseEvent
  /**
    * Fired when the view element gains focus.
    */
  type ListViewFocusEvent = typingsSlinky.titanium.Titanium.UI.ListViewBaseEvent
  /**
    * Fired when the device detects a long click.
    */
  type ListViewLongclickEvent = typingsSlinky.titanium.Titanium.UI.ListViewBaseEvent
  /**
    * Fired when a layout cycle is finished.
    */
  type ListViewPostlayoutEvent = typingsSlinky.titanium.Titanium.UI.ListViewBaseEvent
  /**
    * Fired when the view element gains focus.
    */
  type MaskedImageFocusEvent = typingsSlinky.titanium.Titanium.UI.MaskedImageBaseEvent
  /**
    * Fired when the device detects a long click.
    */
  type MaskedImageLongclickEvent = typingsSlinky.titanium.Titanium.UI.MaskedImageBaseEvent
  /**
    * Fired when a layout cycle is finished.
    */
  type MaskedImagePostlayoutEvent = typingsSlinky.titanium.Titanium.UI.MaskedImageBaseEvent
  /**
    * Fired when the back button is pressed by the user.
    */
  type NavigationWindowAndroidbackEvent = typingsSlinky.titanium.Titanium.UI.NavigationWindowBaseEvent
  /**
    * Fired when the Camera button is released.
    */
  type NavigationWindowAndroidcameraEvent = typingsSlinky.titanium.Titanium.UI.NavigationWindowBaseEvent
  /**
    * Fired when the Camera button is half-pressed then released.
    */
  type NavigationWindowAndroidfocusEvent = typingsSlinky.titanium.Titanium.UI.NavigationWindowBaseEvent
  /**
    * Fired when the Search button is released.
    */
  type NavigationWindowAndroidsearchEvent = typingsSlinky.titanium.Titanium.UI.NavigationWindowBaseEvent
  /**
    * Fired when the volume down button is released.
    */
  type NavigationWindowAndroidvoldownEvent = typingsSlinky.titanium.Titanium.UI.NavigationWindowBaseEvent
  /**
    * Fired when the volume up button is released.
    */
  type NavigationWindowAndroidvolupEvent = typingsSlinky.titanium.Titanium.UI.NavigationWindowBaseEvent
  /**
    * Fired when the window loses focus.
    */
  type NavigationWindowBlurEvent = typingsSlinky.titanium.Titanium.UI.NavigationWindowBaseEvent
  /**
    * Fired when the window is closed.
    */
  type NavigationWindowCloseEvent = typingsSlinky.titanium.Titanium.UI.NavigationWindowBaseEvent
  /**
    * Fired when the window gains focus.
    */
  type NavigationWindowFocusEvent = typingsSlinky.titanium.Titanium.UI.NavigationWindowBaseEvent
  /**
    * Fired when the device detects a long click.
    */
  type NavigationWindowLongclickEvent = typingsSlinky.titanium.Titanium.UI.NavigationWindowBaseEvent
  /**
    * Fired when the window is opened.
    */
  type NavigationWindowOpenEvent = typingsSlinky.titanium.Titanium.UI.NavigationWindowBaseEvent
  /**
    * Fired when a layout cycle is finished.
    */
  type NavigationWindowPostlayoutEvent = typingsSlinky.titanium.Titanium.UI.NavigationWindowBaseEvent
  /**
    * Fired when the view element gains focus.
    */
  type OptionDialogFocusEvent = typingsSlinky.titanium.Titanium.UI.OptionDialogBaseEvent
  /**
    * Fired when the device detects a long click.
    */
  type OptionDialogLongclickEvent = typingsSlinky.titanium.Titanium.UI.OptionDialogBaseEvent
  /**
    * Fired when a layout cycle is finished.
    */
  type OptionDialogPostlayoutEvent = typingsSlinky.titanium.Titanium.UI.OptionDialogBaseEvent
  /**
    * Fired when the view element gains focus.
    */
  type PickerColumnFocusEvent = typingsSlinky.titanium.Titanium.UI.PickerColumnBaseEvent
  /**
    * Fired when the device detects a long click.
    */
  type PickerColumnLongclickEvent = typingsSlinky.titanium.Titanium.UI.PickerColumnBaseEvent
  /**
    * Fired when a layout cycle is finished.
    */
  type PickerColumnPostlayoutEvent = typingsSlinky.titanium.Titanium.UI.PickerColumnBaseEvent
  /**
    * Fired when the view element gains focus.
    */
  type PickerFocusEvent = typingsSlinky.titanium.Titanium.UI.PickerBaseEvent
  /**
    * Fired when the device detects a long click.
    */
  type PickerLongclickEvent = typingsSlinky.titanium.Titanium.UI.PickerBaseEvent
  /**
    * Fired when a layout cycle is finished.
    */
  type PickerPostlayoutEvent = typingsSlinky.titanium.Titanium.UI.PickerBaseEvent
  /**
    * Fired when the view element gains focus.
    */
  type PickerRowFocusEvent = typingsSlinky.titanium.Titanium.UI.PickerRowBaseEvent
  /**
    * Fired when the device detects a long click.
    */
  type PickerRowLongclickEvent = typingsSlinky.titanium.Titanium.UI.PickerRowBaseEvent
  /**
    * Fired when a layout cycle is finished.
    */
  type PickerRowPostlayoutEvent = typingsSlinky.titanium.Titanium.UI.PickerRowBaseEvent
  /**
    * Fired when the view element gains focus.
    */
  type ProgressBarFocusEvent = typingsSlinky.titanium.Titanium.UI.ProgressBarBaseEvent
  /**
    * Fired when the device detects a long click.
    */
  type ProgressBarLongclickEvent = typingsSlinky.titanium.Titanium.UI.ProgressBarBaseEvent
  /**
    * Fired when a layout cycle is finished.
    */
  type ProgressBarPostlayoutEvent = typingsSlinky.titanium.Titanium.UI.ProgressBarBaseEvent
  /**
    * Fired when the scrollable region starts being dragged.
    */
  type ScrollViewDragstartEvent = typingsSlinky.titanium.Titanium.UI.ScrollViewBaseEvent
  /**
    * Fired when the view element gains focus.
    */
  type ScrollViewFocusEvent = typingsSlinky.titanium.Titanium.UI.ScrollViewBaseEvent
  /**
    * Fired when the device detects a long click.
    */
  type ScrollViewLongclickEvent = typingsSlinky.titanium.Titanium.UI.ScrollViewBaseEvent
  /**
    * Fired when a layout cycle is finished.
    */
  type ScrollViewPostlayoutEvent = typingsSlinky.titanium.Titanium.UI.ScrollViewBaseEvent
  /**
    * Fired when the scrollable region starts being dragged.
    */
  type ScrollView_DragStartEvent = typingsSlinky.titanium.Titanium.UI.ScrollViewBaseEvent
  /**
    * Fired when the view element gains focus.
    */
  type ScrollableViewFocusEvent = typingsSlinky.titanium.Titanium.UI.ScrollableViewBaseEvent
  /**
    * Fired when the device detects a long click.
    */
  type ScrollableViewLongclickEvent = typingsSlinky.titanium.Titanium.UI.ScrollableViewBaseEvent
  /**
    * Fired when a layout cycle is finished.
    */
  type ScrollableViewPostlayoutEvent = typingsSlinky.titanium.Titanium.UI.ScrollableViewBaseEvent
  /**
    * Fired when the device detects a long click.
    */
  type SearchBarLongclickEvent = typingsSlinky.titanium.Titanium.UI.SearchBarBaseEvent
  /**
    * Fired when a layout cycle is finished.
    */
  type SearchBarPostlayoutEvent = typingsSlinky.titanium.Titanium.UI.SearchBarBaseEvent
  /**
    * Fired when the view element gains focus.
    */
  type SliderFocusEvent = typingsSlinky.titanium.Titanium.UI.SliderBaseEvent
  /**
    * Fired when the device detects a long click.
    */
  type SliderLongclickEvent = typingsSlinky.titanium.Titanium.UI.SliderBaseEvent
  /**
    * Fired when a layout cycle is finished.
    */
  type SliderPostlayoutEvent = typingsSlinky.titanium.Titanium.UI.SliderBaseEvent
  /**
    * Fired when the view element gains focus.
    */
  type SwitchFocusEvent = typingsSlinky.titanium.Titanium.UI.SwitchBaseEvent
  /**
    * Fired when the device detects a long click.
    */
  type SwitchLongclickEvent = typingsSlinky.titanium.Titanium.UI.SwitchBaseEvent
  /**
    * Fired when a layout cycle is finished.
    */
  type SwitchPostlayoutEvent = typingsSlinky.titanium.Titanium.UI.SwitchBaseEvent
  /**
    * Fired when the back button is pressed by the user.
    */
  type TabGroupAndroidbackEvent = typingsSlinky.titanium.Titanium.UI.TabGroupBaseEvent
  /**
    * Fired when the Camera button is released.
    */
  type TabGroupAndroidcameraEvent = typingsSlinky.titanium.Titanium.UI.TabGroupBaseEvent
  /**
    * Fired when the Camera button is half-pressed then released.
    */
  type TabGroupAndroidfocusEvent = typingsSlinky.titanium.Titanium.UI.TabGroupBaseEvent
  /**
    * Fired when the Search button is released.
    */
  type TabGroupAndroidsearchEvent = typingsSlinky.titanium.Titanium.UI.TabGroupBaseEvent
  /**
    * Fired when the volume down button is released.
    */
  type TabGroupAndroidvoldownEvent = typingsSlinky.titanium.Titanium.UI.TabGroupBaseEvent
  /**
    * Fired when the volume up button is released.
    */
  type TabGroupAndroidvolupEvent = typingsSlinky.titanium.Titanium.UI.TabGroupBaseEvent
  /**
    * Fired when the tab group is closed.
    */
  type TabGroupCloseEvent = typingsSlinky.titanium.Titanium.UI.TabGroupBaseEvent
  /**
    * Fired when the device detects a long click.
    */
  type TabGroupLongclickEvent = typingsSlinky.titanium.Titanium.UI.TabGroupBaseEvent
  /**
    * Fired when the tab group is opened.
    */
  type TabGroupOpenEvent = typingsSlinky.titanium.Titanium.UI.TabGroupBaseEvent
  /**
    * Fired when a layout cycle is finished.
    */
  type TabGroupPostlayoutEvent = typingsSlinky.titanium.Titanium.UI.TabGroupBaseEvent
  /**
    * Fired when the device detects a long click.
    */
  type TabLongclickEvent = typingsSlinky.titanium.Titanium.UI.TabBaseEvent
  /**
    * Fired when a layout cycle is finished.
    */
  type TabPostlayoutEvent = typingsSlinky.titanium.Titanium.UI.TabBaseEvent
  /**
    * Fired when the view element gains focus.
    */
  type TabbedBarFocusEvent = typingsSlinky.titanium.Titanium.UI.TabbedBarBaseEvent
  /**
    * Fired when the device detects a long click.
    */
  type TabbedBarLongclickEvent = typingsSlinky.titanium.Titanium.UI.TabbedBarBaseEvent
  /**
    * Fired when a layout cycle is finished.
    */
  type TabbedBarPostlayoutEvent = typingsSlinky.titanium.Titanium.UI.TabbedBarBaseEvent
  /**
    * Fired when the scrollable region starts being dragged.
    */
  type TableViewDragstartEvent = typingsSlinky.titanium.Titanium.UI.TableViewBaseEvent
  /**
    * Fired when the view element gains focus.
    */
  type TableViewFocusEvent = typingsSlinky.titanium.Titanium.UI.TableViewBaseEvent
  /**
    * Fired when the device detects a long click.
    */
  type TableViewLongclickEvent = typingsSlinky.titanium.Titanium.UI.TableViewBaseEvent
  /**
    * Fired when a layout cycle is finished.
    */
  type TableViewPostlayoutEvent = typingsSlinky.titanium.Titanium.UI.TableViewBaseEvent
  /**
    * Fired when the view element gains focus.
    */
  type TableViewRowFocusEvent = typingsSlinky.titanium.Titanium.UI.TableViewRowBaseEvent
  /**
    * Fired when the device detects a long click.
    */
  type TableViewRowLongclickEvent = typingsSlinky.titanium.Titanium.UI.TableViewRowBaseEvent
  /**
    * Fired when a layout cycle is finished.
    */
  type TableViewRowPostlayoutEvent = typingsSlinky.titanium.Titanium.UI.TableViewRowBaseEvent
  /**
    * Fired when the device detects a long click.
    */
  type TextAreaLongclickEvent = typingsSlinky.titanium.Titanium.UI.TextAreaBaseEvent
  /**
    * Fired when a layout cycle is finished.
    */
  type TextAreaPostlayoutEvent = typingsSlinky.titanium.Titanium.UI.TextAreaBaseEvent
  /**
    * Fired when the device detects a long click.
    */
  type TextFieldLongclickEvent = typingsSlinky.titanium.Titanium.UI.TextFieldBaseEvent
  /**
    * Fired when a layout cycle is finished.
    */
  type TextFieldPostlayoutEvent = typingsSlinky.titanium.Titanium.UI.TextFieldBaseEvent
  /**
    * Fired when the view element gains focus.
    */
  type ToolbarFocusEvent = typingsSlinky.titanium.Titanium.UI.ToolbarBaseEvent
  /**
    * Fired when the device detects a long click.
    */
  type ToolbarLongclickEvent = typingsSlinky.titanium.Titanium.UI.ToolbarBaseEvent
  /**
    * Fired when a layout cycle is finished.
    */
  type ToolbarPostlayoutEvent = typingsSlinky.titanium.Titanium.UI.ToolbarBaseEvent
  /**
    * Fired when the view element gains focus.
    */
  type ViewFocusEvent = typingsSlinky.titanium.Titanium.UI.ViewBaseEvent
  /**
    * Fired when the device detects a long click.
    */
  type ViewLongclickEvent = typingsSlinky.titanium.Titanium.UI.ViewBaseEvent
  /**
    * Fired when a layout cycle is finished.
    */
  type ViewPostlayoutEvent = typingsSlinky.titanium.Titanium.UI.ViewBaseEvent
  /**
    * Fired when the view element gains focus.
    */
  type WebViewFocusEvent = typingsSlinky.titanium.Titanium.UI.WebViewBaseEvent
  /**
    * Fired when the device detects a long click.
    */
  type WebViewLongclickEvent = typingsSlinky.titanium.Titanium.UI.WebViewBaseEvent
  /**
    * Fired when a layout cycle is finished.
    */
  type WebViewPostlayoutEvent = typingsSlinky.titanium.Titanium.UI.WebViewBaseEvent
  /**
    * Fired when the back button is pressed by the user.
    */
  type WindowAndroidbackEvent = typingsSlinky.titanium.Titanium.UI.WindowBaseEvent
  /**
    * Fired when the Camera button is released.
    */
  type WindowAndroidcameraEvent = typingsSlinky.titanium.Titanium.UI.WindowBaseEvent
  /**
    * Fired when the Camera button is half-pressed then released.
    */
  type WindowAndroidfocusEvent = typingsSlinky.titanium.Titanium.UI.WindowBaseEvent
  /**
    * Fired when the Search button is released.
    */
  type WindowAndroidsearchEvent = typingsSlinky.titanium.Titanium.UI.WindowBaseEvent
  /**
    * Fired when the volume down button is released.
    */
  type WindowAndroidvoldownEvent = typingsSlinky.titanium.Titanium.UI.WindowBaseEvent
  /**
    * Fired when the volume up button is released.
    */
  type WindowAndroidvolupEvent = typingsSlinky.titanium.Titanium.UI.WindowBaseEvent
  /**
    * Fired when the window loses focus.
    */
  type WindowBlurEvent = typingsSlinky.titanium.Titanium.UI.WindowBaseEvent
  /**
    * Fired when the window is closed.
    */
  type WindowCloseEvent = typingsSlinky.titanium.Titanium.UI.WindowBaseEvent
  /**
    * Fired when the window gains focus.
    */
  type WindowFocusEvent = typingsSlinky.titanium.Titanium.UI.WindowBaseEvent
  /**
    * Fired when the device detects a long click.
    */
  type WindowLongclickEvent = typingsSlinky.titanium.Titanium.UI.WindowBaseEvent
  /**
    * Fired when the window is opened.
    */
  type WindowOpenEvent = typingsSlinky.titanium.Titanium.UI.WindowBaseEvent
  /**
    * Fired when a layout cycle is finished.
    */
  type WindowPostlayoutEvent = typingsSlinky.titanium.Titanium.UI.WindowBaseEvent
  /**
    * Apple iOS specific UI capabilities.  All properties, methods and events in this namespace will
    * only work on Apple iOS devices.
    */
  type iOS = typingsSlinky.titanium.Titanium.Module
  /**
    * iPad specific UI capabilities.
    */
  type iPad = typingsSlinky.titanium.Titanium.Module
}
