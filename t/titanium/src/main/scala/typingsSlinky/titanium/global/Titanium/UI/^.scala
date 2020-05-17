package typingsSlinky.titanium.global.Titanium.UI

import typingsSlinky.titanium.Dictionary
import typingsSlinky.titanium.Matrix2DCreationDict
import typingsSlinky.titanium.Matrix3DCreationDict
import typingsSlinky.titanium.Titanium.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Titanium.UI")
@js.native
object ^ extends js.Object {
  /**
  		 * The name of the API that this proxy corresponds to.
  		 */
  val apiName: String = js.native
  /**
  		 * Sets the background color of the master view (when there are no windows or other top-level
  		 * controls displayed).
  		 */
  var backgroundColor: String = js.native
  /**
  		 * Local path or URL to an image file for setting a background for the master view (when there
  		 * are no windows or other top-level controls displayed).
  		 */
  var backgroundImage: String = js.native
  /**
  		 * Indicates if the proxy will bubble an event to its parent.
  		 */
  var bubbleParent: Boolean = js.native
  /**
  		 * The Window or TabGroup whose Activity lifecycle should be triggered on the proxy.
  		 */
  var lifecycleContainer: typingsSlinky.titanium.Titanium.UI.Window | typingsSlinky.titanium.Titanium.UI.TabGroup = js.native
  /**
  		 * When running on Android, iOS 10 or lower, or Windows the value to return form the applications colorset.
  		 */
  var semanticColorType: String = js.native
  /**
  		 * Sets the global tint color of the application. It is inherited by the child views and can be
  		 * overwritten by them using the `tintColor` property.
  		 */
  var tintColor: String = js.native
  /**
  		 * Adds the specified callback as an event listener for the named event.
  		 */
  def addEventListener(name: String, callback: js.Function1[/* param0 */ Event, Unit]): Unit = js.native
  /**
  		 * Applies the properties to the proxy.
  		 */
  def applyProperties(props: js.Any): Unit = js.native
  /**
  		 * Converts one type of unit to another using the metrics of the main display.
  		 */
  def convertUnits(convertFromValue: String, convertToUnits: Double): Double = js.native
  /**
  		 * Creates and returns an instance of <Titanium.UI.2DMatrix>.
  		 * @deprecated Use [Titanium.UI.createMatrix2D](Titanium.UI.createMatrix2D) instead.
  		 */
  def create2DMatrix(): typingsSlinky.titanium.Titanium.UI.Matrix2D = js.native
  def create2DMatrix(parameters: Matrix2DCreationDict): typingsSlinky.titanium.Titanium.UI.Matrix2D = js.native
  /**
  		 * Creates and returns an instance of <Titanium.UI.3DMatrix>.
  		 * @deprecated Use [Titanium.UI.createMatrix3D](Titanium.UI.createMatrix3D) instead.
  		 */
  def create3DMatrix(): typingsSlinky.titanium.Titanium.UI.Matrix3D = js.native
  def create3DMatrix(parameters: Matrix3DCreationDict): typingsSlinky.titanium.Titanium.UI.Matrix3D = js.native
  /**
  		 * Creates and returns an instance of <Titanium.UI.ActivityIndicator>.
  		 */
  def createActivityIndicator(): typingsSlinky.titanium.Titanium.UI.ActivityIndicator = js.native
  def createActivityIndicator(parameters: Dictionary[typingsSlinky.titanium.Titanium.UI.ActivityIndicator]): typingsSlinky.titanium.Titanium.UI.ActivityIndicator = js.native
  /**
  		 * Creates and returns an instance of <Titanium.UI.AlertDialog>.
  		 */
  def createAlertDialog(): typingsSlinky.titanium.Titanium.UI.AlertDialog = js.native
  def createAlertDialog(parameters: Dictionary[typingsSlinky.titanium.Titanium.UI.AlertDialog]): typingsSlinky.titanium.Titanium.UI.AlertDialog = js.native
  /**
  		 * Creates and returns an instance of <Titanium.UI.Animation>.
  		 */
  def createAnimation(): typingsSlinky.titanium.Titanium.UI.Animation = js.native
  def createAnimation(parameters: Dictionary[typingsSlinky.titanium.Titanium.UI.Animation]): typingsSlinky.titanium.Titanium.UI.Animation = js.native
  /**
  		 * Creates and returns an instance of <Titanium.UI.AttributedString>.
  		 */
  def createAttributedString(): typingsSlinky.titanium.Titanium.UI.AttributedString = js.native
  def createAttributedString(parameters: Dictionary[typingsSlinky.titanium.Titanium.UI.AttributedString]): typingsSlinky.titanium.Titanium.UI.AttributedString = js.native
  /**
  		 * Creates and returns an instance of <Titanium.UI.Button>.
  		 */
  def createButton(): typingsSlinky.titanium.Titanium.UI.Button = js.native
  def createButton(parameters: Dictionary[typingsSlinky.titanium.Titanium.UI.Button]): typingsSlinky.titanium.Titanium.UI.Button = js.native
  /**
  		 * Creates and returns an instance of <Titanium.UI.ButtonBar>.
  		 */
  def createButtonBar(): typingsSlinky.titanium.Titanium.UI.ButtonBar = js.native
  def createButtonBar(parameters: Dictionary[typingsSlinky.titanium.Titanium.UI.ButtonBar]): typingsSlinky.titanium.Titanium.UI.ButtonBar = js.native
  /**
  		 * Creates and returns an instance of <Titanium.UI.DashboardItem>.
  		 */
  def createDashboardItem(): typingsSlinky.titanium.Titanium.UI.DashboardItem = js.native
  def createDashboardItem(parameters: Dictionary[typingsSlinky.titanium.Titanium.UI.DashboardItem]): typingsSlinky.titanium.Titanium.UI.DashboardItem = js.native
  /**
  		 * Creates and returns an instance of <Titanium.UI.DashboardView>.
  		 */
  def createDashboardView(): typingsSlinky.titanium.Titanium.UI.DashboardView = js.native
  def createDashboardView(parameters: Dictionary[typingsSlinky.titanium.Titanium.UI.DashboardView]): typingsSlinky.titanium.Titanium.UI.DashboardView = js.native
  /**
  		 * Creates and returns an instance of <Titanium.UI.EmailDialog>.
  		 */
  def createEmailDialog(): typingsSlinky.titanium.Titanium.UI.EmailDialog = js.native
  def createEmailDialog(parameters: Dictionary[typingsSlinky.titanium.Titanium.UI.EmailDialog]): typingsSlinky.titanium.Titanium.UI.EmailDialog = js.native
  /**
  		 * Creates and returns an instance of <Titanium.UI.ImageView>.
  		 */
  def createImageView(): typingsSlinky.titanium.Titanium.UI.ImageView = js.native
  def createImageView(parameters: Dictionary[typingsSlinky.titanium.Titanium.UI.ImageView]): typingsSlinky.titanium.Titanium.UI.ImageView = js.native
  /**
  		 * Creates and returns an instance of <Titanium.UI.Label>.
  		 */
  def createLabel(): typingsSlinky.titanium.Titanium.UI.Label = js.native
  def createLabel(parameters: Dictionary[typingsSlinky.titanium.Titanium.UI.Label]): typingsSlinky.titanium.Titanium.UI.Label = js.native
  /**
  		 * Creates and returns an instance of <Titanium.UI.ListSection>.
  		 */
  def createListSection(): typingsSlinky.titanium.Titanium.UI.ListSection = js.native
  def createListSection(parameters: Dictionary[typingsSlinky.titanium.Titanium.UI.ListSection]): typingsSlinky.titanium.Titanium.UI.ListSection = js.native
  /**
  		 * Creates and returns an instance of <Titanium.UI.ListView>.
  		 */
  def createListView(): typingsSlinky.titanium.Titanium.UI.ListView = js.native
  def createListView(parameters: Dictionary[typingsSlinky.titanium.Titanium.UI.ListView]): typingsSlinky.titanium.Titanium.UI.ListView = js.native
  /**
  		 * Creates and returns an instance of <Titanium.UI.MaskedImage>.
  		 */
  def createMaskedImage(): typingsSlinky.titanium.Titanium.UI.MaskedImage = js.native
  def createMaskedImage(parameters: Dictionary[typingsSlinky.titanium.Titanium.UI.MaskedImage]): typingsSlinky.titanium.Titanium.UI.MaskedImage = js.native
  /**
  		 * Creates and returns an instance of <Titanium.UI.Matrix2D>.
  		 */
  def createMatrix2D(): typingsSlinky.titanium.Titanium.UI.Matrix2D = js.native
  def createMatrix2D(parameters: Matrix2DCreationDict): typingsSlinky.titanium.Titanium.UI.Matrix2D = js.native
  /**
  		 * Creates and returns an instance of <Titanium.UI.Matrix3D>.
  		 */
  def createMatrix3D(): typingsSlinky.titanium.Titanium.UI.Matrix3D = js.native
  def createMatrix3D(parameters: Matrix3DCreationDict): typingsSlinky.titanium.Titanium.UI.Matrix3D = js.native
  /**
  		 * Creates and returns an instance of <Titanium.UI.NavigationWindow>.
  		 */
  def createNavigationWindow(): typingsSlinky.titanium.Titanium.UI.NavigationWindow = js.native
  def createNavigationWindow(parameters: Dictionary[typingsSlinky.titanium.Titanium.UI.NavigationWindow]): typingsSlinky.titanium.Titanium.UI.NavigationWindow = js.native
  /**
  		 * Creates and returns an instance of <Titanium.UI.Notification>.
  		 */
  def createNotification(): typingsSlinky.titanium.Titanium.UI.Notification = js.native
  def createNotification(parameters: Dictionary[typingsSlinky.titanium.Titanium.UI.Notification]): typingsSlinky.titanium.Titanium.UI.Notification = js.native
  /**
  		 * Creates and returns an instance of <Titanium.UI.OptionDialog>.
  		 */
  def createOptionDialog(): typingsSlinky.titanium.Titanium.UI.OptionDialog = js.native
  def createOptionDialog(parameters: Dictionary[typingsSlinky.titanium.Titanium.UI.OptionDialog]): typingsSlinky.titanium.Titanium.UI.OptionDialog = js.native
  /**
  		 * Creates and returns an instance of <Titanium.UI.Picker>.
  		 */
  def createPicker(): typingsSlinky.titanium.Titanium.UI.Picker = js.native
  def createPicker(parameters: Dictionary[typingsSlinky.titanium.Titanium.UI.Picker]): typingsSlinky.titanium.Titanium.UI.Picker = js.native
  /**
  		 * Creates and returns an instance of <Titanium.UI.PickerColumn>.
  		 */
  def createPickerColumn(): typingsSlinky.titanium.Titanium.UI.PickerColumn = js.native
  def createPickerColumn(parameters: Dictionary[typingsSlinky.titanium.Titanium.UI.PickerColumn]): typingsSlinky.titanium.Titanium.UI.PickerColumn = js.native
  /**
  		 * Creates and returns an instance of <Titanium.UI.PickerRow>.
  		 */
  def createPickerRow(): typingsSlinky.titanium.Titanium.UI.PickerRow = js.native
  def createPickerRow(parameters: Dictionary[typingsSlinky.titanium.Titanium.UI.PickerRow]): typingsSlinky.titanium.Titanium.UI.PickerRow = js.native
  /**
  		 * Creates and returns an instance of <Titanium.UI.ProgressBar>.
  		 */
  def createProgressBar(): typingsSlinky.titanium.Titanium.UI.ProgressBar = js.native
  def createProgressBar(parameters: Dictionary[typingsSlinky.titanium.Titanium.UI.ProgressBar]): typingsSlinky.titanium.Titanium.UI.ProgressBar = js.native
  /**
  		 * Creates and returns an instance of <Titanium.UI.RefreshControl>.
  		 */
  def createRefreshControl(): typingsSlinky.titanium.Titanium.UI.RefreshControl = js.native
  def createRefreshControl(parameters: Dictionary[typingsSlinky.titanium.Titanium.UI.RefreshControl]): typingsSlinky.titanium.Titanium.UI.RefreshControl = js.native
  /**
  		 * Creates and returns an instance of <Titanium.UI.ScrollView>.
  		 */
  def createScrollView(): typingsSlinky.titanium.Titanium.UI.ScrollView = js.native
  def createScrollView(parameters: Dictionary[typingsSlinky.titanium.Titanium.UI.ScrollView]): typingsSlinky.titanium.Titanium.UI.ScrollView = js.native
  /**
  		 * Creates and returns an instance of <Titanium.UI.ScrollableView>.
  		 */
  def createScrollableView(): typingsSlinky.titanium.Titanium.UI.ScrollableView = js.native
  def createScrollableView(parameters: Dictionary[typingsSlinky.titanium.Titanium.UI.ScrollableView]): typingsSlinky.titanium.Titanium.UI.ScrollableView = js.native
  /**
  		 * Creates and returns an instance of <Titanium.UI.SearchBar>.
  		 */
  def createSearchBar(): typingsSlinky.titanium.Titanium.UI.SearchBar = js.native
  def createSearchBar(parameters: Dictionary[typingsSlinky.titanium.Titanium.UI.SearchBar]): typingsSlinky.titanium.Titanium.UI.SearchBar = js.native
  /**
  		 * Creates and returns an instance of <Titanium.UI.ShortcutItem>.
  		 */
  def createShortcutItem(): typingsSlinky.titanium.Titanium.UI.ShortcutItem = js.native
  def createShortcutItem(parameters: Dictionary[typingsSlinky.titanium.Titanium.UI.ShortcutItem]): typingsSlinky.titanium.Titanium.UI.ShortcutItem = js.native
  /**
  		 * Creates and returns an instance of <Titanium.UI.Slider>.
  		 */
  def createSlider(): typingsSlinky.titanium.Titanium.UI.Slider = js.native
  def createSlider(parameters: Dictionary[typingsSlinky.titanium.Titanium.UI.Slider]): typingsSlinky.titanium.Titanium.UI.Slider = js.native
  /**
  		 * Creates and returns an instance of <Titanium.UI.Switch>.
  		 */
  def createSwitch(): typingsSlinky.titanium.Titanium.UI.Switch = js.native
  def createSwitch(parameters: Dictionary[typingsSlinky.titanium.Titanium.UI.Switch]): typingsSlinky.titanium.Titanium.UI.Switch = js.native
  /**
  		 * Creates and returns an instance of <Titanium.UI.Tab>.
  		 */
  def createTab(): typingsSlinky.titanium.Titanium.UI.Tab = js.native
  def createTab(parameters: Dictionary[typingsSlinky.titanium.Titanium.UI.Tab]): typingsSlinky.titanium.Titanium.UI.Tab = js.native
  /**
  		 * Creates and returns an instance of <Titanium.UI.TabGroup>.
  		 */
  def createTabGroup(): typingsSlinky.titanium.Titanium.UI.TabGroup = js.native
  def createTabGroup(parameters: Dictionary[typingsSlinky.titanium.Titanium.UI.TabGroup]): typingsSlinky.titanium.Titanium.UI.TabGroup = js.native
  /**
  		 * Creates and returns an instance of <Titanium.UI.TabbedBar>.
  		 */
  def createTabbedBar(): typingsSlinky.titanium.Titanium.UI.TabbedBar = js.native
  def createTabbedBar(parameters: Dictionary[typingsSlinky.titanium.Titanium.UI.TabbedBar]): typingsSlinky.titanium.Titanium.UI.TabbedBar = js.native
  /**
  		 * Creates and returns an instance of <Titanium.UI.TableView>.
  		 */
  def createTableView(): typingsSlinky.titanium.Titanium.UI.TableView = js.native
  def createTableView(parameters: Dictionary[typingsSlinky.titanium.Titanium.UI.TableView]): typingsSlinky.titanium.Titanium.UI.TableView = js.native
  /**
  		 * Creates and returns an instance of <Titanium.UI.TableViewRow>.
  		 */
  def createTableViewRow(): typingsSlinky.titanium.Titanium.UI.TableViewRow = js.native
  def createTableViewRow(parameters: Dictionary[typingsSlinky.titanium.Titanium.UI.TableViewRow]): typingsSlinky.titanium.Titanium.UI.TableViewRow = js.native
  /**
  		 * Creates and returns an instance of <Titanium.UI.TableViewSection>.
  		 */
  def createTableViewSection(): typingsSlinky.titanium.Titanium.UI.TableViewSection = js.native
  def createTableViewSection(parameters: Dictionary[typingsSlinky.titanium.Titanium.UI.TableViewSection]): typingsSlinky.titanium.Titanium.UI.TableViewSection = js.native
  /**
  		 * Creates and returns an instance of <Titanium.UI.TextArea>.
  		 */
  def createTextArea(): typingsSlinky.titanium.Titanium.UI.TextArea = js.native
  def createTextArea(parameters: Dictionary[typingsSlinky.titanium.Titanium.UI.TextArea]): typingsSlinky.titanium.Titanium.UI.TextArea = js.native
  /**
  		 * Creates and returns an instance of <Titanium.UI.TextField>.
  		 */
  def createTextField(): typingsSlinky.titanium.Titanium.UI.TextField = js.native
  def createTextField(parameters: Dictionary[typingsSlinky.titanium.Titanium.UI.TextField]): typingsSlinky.titanium.Titanium.UI.TextField = js.native
  /**
  		 * Creates and returns an instance of <Titanium.UI.Toolbar>.
  		 */
  def createToolbar(): typingsSlinky.titanium.Titanium.UI.Toolbar = js.native
  def createToolbar(parameters: Dictionary[typingsSlinky.titanium.Titanium.UI.Toolbar]): typingsSlinky.titanium.Titanium.UI.Toolbar = js.native
  /**
  		 * Creates and returns an instance of <Titanium.UI.View>.
  		 */
  def createView(): typingsSlinky.titanium.Titanium.UI.View = js.native
  def createView(parameters: Dictionary[typingsSlinky.titanium.Titanium.UI.View]): typingsSlinky.titanium.Titanium.UI.View = js.native
  /**
  		 * Creates and returns an instance of <Titanium.UI.WebView>.
  		 */
  def createWebView(): typingsSlinky.titanium.Titanium.UI.WebView = js.native
  def createWebView(parameters: Dictionary[typingsSlinky.titanium.Titanium.UI.WebView]): typingsSlinky.titanium.Titanium.UI.WebView = js.native
  /**
  		 * Creates and returns an instance of <Titanium.UI.Window>.
  		 */
  def createWindow(): typingsSlinky.titanium.Titanium.UI.Window = js.native
  def createWindow(parameters: Dictionary[typingsSlinky.titanium.Titanium.UI.Window]): typingsSlinky.titanium.Titanium.UI.Window = js.native
  /**
  		 * Fetches the correct color to be used with a UI element dependent on the users current dark mode setting on iOS 13 and above, or the [Titanium.UI.semanticColorType](Titanium.UI.semanticColorType) setting in other instances.
  		 */
  def fetchSemanticColor(colorName: String): String = js.native
  /**
  		 * Fires a synthesized event to any registered listeners.
  		 */
  def fireEvent(name: String): Unit = js.native
  def fireEvent(name: String, event: js.Any): Unit = js.native
  /**
  		 * Gets the value of the <Titanium.UI.apiName> property.
  		 * @deprecated Access <Titanium.UI.apiName> instead.
  		 */
  def getApiName(): String = js.native
  /**
  		 * Gets the value of the <Titanium.UI.backgroundColor> property.
  		 * @deprecated Access <Titanium.UI.backgroundColor> instead.
  		 */
  def getBackgroundColor(): String = js.native
  /**
  		 * Gets the value of the <Titanium.UI.backgroundImage> property.
  		 * @deprecated Access <Titanium.UI.backgroundImage> instead.
  		 */
  def getBackgroundImage(): String = js.native
  /**
  		 * Gets the value of the <Titanium.UI.bubbleParent> property.
  		 * @deprecated Access <Titanium.UI.bubbleParent> instead.
  		 */
  def getBubbleParent(): Boolean = js.native
  /**
  		 * Gets the value of the <Titanium.UI.lifecycleContainer> property.
  		 * @deprecated Access <Titanium.UI.lifecycleContainer> instead.
  		 */
  def getLifecycleContainer(): typingsSlinky.titanium.Titanium.UI.Window | typingsSlinky.titanium.Titanium.UI.TabGroup = js.native
  /**
  		 * Gets the value of the <Titanium.UI.semanticColorType> property.
  		 * @deprecated Access <Titanium.UI.semanticColorType> instead.
  		 */
  def getSemanticColorType(): String = js.native
  /**
  		 * Gets the value of the <Titanium.UI.tintColor> property.
  		 * @deprecated Access <Titanium.UI.tintColor> instead.
  		 */
  def getTintColor(): String = js.native
  /**
  		 * Removes the specified callback as an event listener for the named event.
  		 */
  def removeEventListener(name: String, callback: js.Function1[/* param0 */ Event, Unit]): Unit = js.native
  /**
  		 * Sets the value of the <Titanium.UI.backgroundColor> property.
  		 * @deprecated Set the value using <Titanium.UI.backgroundColor> instead.
  		 */
  def setBackgroundColor(backgroundColor: String): Unit = js.native
  /**
  		 * Sets the value of the <Titanium.UI.backgroundImage> property.
  		 * @deprecated Set the value using <Titanium.UI.backgroundImage> instead.
  		 */
  def setBackgroundImage(backgroundImage: String): Unit = js.native
  /**
  		 * Sets the value of the <Titanium.UI.bubbleParent> property.
  		 * @deprecated Set the value using <Titanium.UI.bubbleParent> instead.
  		 */
  def setBubbleParent(bubbleParent: Boolean): Unit = js.native
  def setLifecycleContainer(lifecycleContainer: typingsSlinky.titanium.Titanium.UI.TabGroup): Unit = js.native
  /**
  		 * Sets the value of the <Titanium.UI.lifecycleContainer> property.
  		 * @deprecated Set the value using <Titanium.UI.lifecycleContainer> instead.
  		 */
  def setLifecycleContainer(lifecycleContainer: typingsSlinky.titanium.Titanium.UI.Window): Unit = js.native
  /**
  		 * Sets the value of the <Titanium.UI.semanticColorType> property.
  		 * @deprecated Set the value using <Titanium.UI.semanticColorType> instead.
  		 */
  def setSemanticColorType(semanticColorType: String): Unit = js.native
  /**
  		 * Sets the value of the <Titanium.UI.tintColor> property.
  		 * @deprecated Set the value using <Titanium.UI.tintColor> instead.
  		 */
  def setTintColor(tintColor: String): Unit = js.native
}

