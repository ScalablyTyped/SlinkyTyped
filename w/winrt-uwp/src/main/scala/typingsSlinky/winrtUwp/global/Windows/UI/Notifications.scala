package typingsSlinky.winrtUwp.global.Windows.UI

import typingsSlinky.winrtUwp.Windows.Data.Xml.Dom.XmlDocument
import typingsSlinky.winrtUwp.Windows.UI.Notifications.BadgeTemplateType
import typingsSlinky.winrtUwp.Windows.UI.Notifications.TileTemplateType
import typingsSlinky.winrtUwp.Windows.UI.Notifications.ToastTemplateType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Contains classes that encapsulate tile, toast, and badge notifications. */
object Notifications {
  
  /** Defines the content, associated metadata, and expiration time of an update to a tile's badge overlay. A badge can display a number from 1 to 99 or a status glyph. */
  @JSGlobal("Windows.UI.Notifications.BadgeNotification")
  @js.native
  class BadgeNotification protected ()
    extends typingsSlinky.winrtUwp.Windows.UI.Notifications.BadgeNotification {
    /**
      * Creates and initializes a new instance of the BadgeNotification .
      * @param content The XML content that defines the badge update.
      */
    def this(content: XmlDocument) = this()
  }
  
  /** Specifies the template to use for a tile's badge overlay. Used by BadgeUpdateManager.getTemplateContent . */
  @JSGlobal("Windows.UI.Notifications.BadgeTemplateType")
  @js.native
  object BadgeTemplateType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.winrtUwp.Windows.UI.Notifications.BadgeTemplateType with Double] = js.native
    
    /* 0 */ val badgeGlyph: typingsSlinky.winrtUwp.Windows.UI.Notifications.BadgeTemplateType.badgeGlyph with Double = js.native
    
    /* 1 */ val badgeNumber: typingsSlinky.winrtUwp.Windows.UI.Notifications.BadgeTemplateType.badgeNumber with Double = js.native
  }
  
  /** Creates BadgeUpdater objects that you use to manipulate a tile's badge overlay. This class also provides access to the XML content of the system-provided badge templates so that you can customize that content for use in updating your badges. */
  @JSGlobal("Windows.UI.Notifications.BadgeUpdateManager")
  @js.native
  abstract class BadgeUpdateManager ()
    extends typingsSlinky.winrtUwp.Windows.UI.Notifications.BadgeUpdateManager
  object BadgeUpdateManager {
    
    /**
      * Creates and initializes a new instance of the BadgeUpdater , which lets you change the appearance or content of the badge on the calling app's tile.
      * @return The object you will use to send changes to the app tile's badge.
      */
    /* static member */
    @JSGlobal("Windows.UI.Notifications.BadgeUpdateManager.createBadgeUpdaterForApplication")
    @js.native
    def createBadgeUpdaterForApplication(): typingsSlinky.winrtUwp.Windows.UI.Notifications.BadgeUpdater = js.native
    /**
      * Creates and initializes a new instance of the BadgeUpdater for a specified app tile's badge, usually the tile of another app in the package. The BadgeUpdater lets you change the appearance or content of that badge.
      * @param applicationId The unique ID of the tile whose badge you want to update.
      * @return The object you will use to send changes to the application tile's badge.
      */
    /* static member */
    @JSGlobal("Windows.UI.Notifications.BadgeUpdateManager.createBadgeUpdaterForApplication")
    @js.native
    def createBadgeUpdaterForApplication(applicationId: String): typingsSlinky.winrtUwp.Windows.UI.Notifications.BadgeUpdater = js.native
    
    /**
      * Creates and initializes a new instance of the BadgeUpdater , which enables you to change the appearance or content of a badge on a secondary tile . The tile can belong to the calling app or any other app in the same package.
      * @param tileId The unique ID of the tile.
      * @return The object you will use to send badge updates to the tile identified by tileID.
      */
    /* static member */
    @JSGlobal("Windows.UI.Notifications.BadgeUpdateManager.createBadgeUpdaterForSecondaryTile")
    @js.native
    def createBadgeUpdaterForSecondaryTile(tileId: String): typingsSlinky.winrtUwp.Windows.UI.Notifications.BadgeUpdater = js.native
    
    /**
      * Gets the XML content of one of the predefined badge templates so that you can customize it for a badge update.
      * @param type The type of badge template, either a glyph or a number.
      * @return The object that contains the template XML.
      */
    /* static member */
    @JSGlobal("Windows.UI.Notifications.BadgeUpdateManager.getTemplateContent")
    @js.native
    def getTemplateContent(`type`: BadgeTemplateType): XmlDocument = js.native
  }
  
  /** Updates a badge overlay on the specific tile that the updater is bound to. */
  @JSGlobal("Windows.UI.Notifications.BadgeUpdater")
  @js.native
  abstract class BadgeUpdater ()
    extends typingsSlinky.winrtUwp.Windows.UI.Notifications.BadgeUpdater
  
  /** Specifies the limitations on tile or toast notification display. */
  @JSGlobal("Windows.UI.Notifications.NotificationSetting")
  @js.native
  object NotificationSetting extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.winrtUwp.Windows.UI.Notifications.NotificationSetting with Double] = js.native
    
    /* 3 */ val disabledByGroupPolicy: typingsSlinky.winrtUwp.Windows.UI.Notifications.NotificationSetting.disabledByGroupPolicy with Double = js.native
    
    /* 4 */ val disabledByManifest: typingsSlinky.winrtUwp.Windows.UI.Notifications.NotificationSetting.disabledByManifest with Double = js.native
    
    /* 1 */ val disabledForApplication: typingsSlinky.winrtUwp.Windows.UI.Notifications.NotificationSetting.disabledForApplication with Double = js.native
    
    /* 2 */ val disabledForUser: typingsSlinky.winrtUwp.Windows.UI.Notifications.NotificationSetting.disabledForUser with Double = js.native
    
    /* 0 */ val enabled: typingsSlinky.winrtUwp.Windows.UI.Notifications.NotificationSetting.enabled with Double = js.native
  }
  
  /** Specifies the time period for subsequent polls of the tile or badge data source for new content. Used by BadgeUpdater.StartPeriodicUpdate , TileUpdater.StartPeriodicUpdate , and TileUpdater.StartPeriodicUpdateBatch . */
  @JSGlobal("Windows.UI.Notifications.PeriodicUpdateRecurrence")
  @js.native
  object PeriodicUpdateRecurrence extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typingsSlinky.winrtUwp.Windows.UI.Notifications.PeriodicUpdateRecurrence with Double
      ] = js.native
    
    /* 4 */ val daily: typingsSlinky.winrtUwp.Windows.UI.Notifications.PeriodicUpdateRecurrence.daily with Double = js.native
    
    /* 0 */ val halfHour: typingsSlinky.winrtUwp.Windows.UI.Notifications.PeriodicUpdateRecurrence.halfHour with Double = js.native
    
    /* 1 */ val hour: typingsSlinky.winrtUwp.Windows.UI.Notifications.PeriodicUpdateRecurrence.hour with Double = js.native
    
    /* 2 */ val sixHours: typingsSlinky.winrtUwp.Windows.UI.Notifications.PeriodicUpdateRecurrence.sixHours with Double = js.native
    
    /* 3 */ val twelveHours: typingsSlinky.winrtUwp.Windows.UI.Notifications.PeriodicUpdateRecurrence.twelveHours with Double = js.native
  }
  
  /** Defines the visual content and timing for a single, non-recurring scheduled update to a tile. */
  @JSGlobal("Windows.UI.Notifications.ScheduledTileNotification")
  @js.native
  class ScheduledTileNotification protected ()
    extends typingsSlinky.winrtUwp.Windows.UI.Notifications.ScheduledTileNotification {
    /**
      * Creates and initializes a new instance of the ScheduledTileNotification object for use with a TileUpdater .
      * @param content The object that provides the content for the tile notification.
      * @param deliveryTime The time at which the tile should be updated with the notification information.
      */
    def this(content: XmlDocument, deliveryTime: js.Date) = this()
  }
  
  /** Contains the XML that defines the toast notification that will display at the scheduled time. */
  @JSGlobal("Windows.UI.Notifications.ScheduledToastNotification")
  @js.native
  class ScheduledToastNotification protected ()
    extends typingsSlinky.winrtUwp.Windows.UI.Notifications.ScheduledToastNotification {
    /**
      * Creates and initializes a new instance of a ScheduledToastNotification that will be displayed only once.
      * @param content The XML that defines the toast notification content.
      * @param deliveryTime The date and time that Windows should display the toast notification. You must call AddToSchedule before this time.
      */
    def this(content: XmlDocument, deliveryTime: js.Date) = this()
    /**
      * Creates and initializes a new instance of a recurring ScheduledToastNotification .
      * @param content The XML that defines the toast notification content.
      * @param deliveryTime The date and time that Windows should first display the toast notification. You must call AddToSchedule before this time.
      * @param snoozeInterval The amount of time between occurrences of the notification. To be valid, this value must be no less than 60 seconds and no more than 60 minutes.
      * @param maximumSnoozeCount The maximum number of times to display this notification. Valid values range from 1 to 5.
      */
    def this(content: XmlDocument, deliveryTime: js.Date, snoozeInterval: Double, maximumSnoozeCount: Double) = this()
  }
  
  @JSGlobal("Windows.UI.Notifications.TileFlyoutNotification")
  @js.native
  abstract class TileFlyoutNotification ()
    extends typingsSlinky.winrtUwp.Windows.UI.Notifications.TileFlyoutNotification
  
  object TileFlyoutTemplateType {
    
    @JSGlobal("Windows.UI.Notifications.TileFlyoutTemplateType")
    @js.native
    val ^ : js.Any = js.native
    
    @JSGlobal("Windows.UI.Notifications.TileFlyoutTemplateType.tileFlyoutTemplate01")
    @js.native
    def tileFlyoutTemplate01: js.Any = js.native
    @scala.inline
    def tileFlyoutTemplate01_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("tileFlyoutTemplate01")(x.asInstanceOf[js.Any])
  }
  
  @JSGlobal("Windows.UI.Notifications.TileFlyoutUpdateManager")
  @js.native
  abstract class TileFlyoutUpdateManager ()
    extends typingsSlinky.winrtUwp.Windows.UI.Notifications.TileFlyoutUpdateManager
  object TileFlyoutUpdateManager {
    
    @JSGlobal("Windows.UI.Notifications.TileFlyoutUpdateManager")
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @JSGlobal("Windows.UI.Notifications.TileFlyoutUpdateManager.createTileFlyoutUpdaterForApplication")
    @js.native
    def createTileFlyoutUpdaterForApplication: js.Any = js.native
    @scala.inline
    def createTileFlyoutUpdaterForApplication_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("createTileFlyoutUpdaterForApplication")(x.asInstanceOf[js.Any])
    
    /* unmapped type */
    /* static member */
    @JSGlobal("Windows.UI.Notifications.TileFlyoutUpdateManager.createTileFlyoutUpdaterForSecondaryTile")
    @js.native
    def createTileFlyoutUpdaterForSecondaryTile: js.Any = js.native
    @scala.inline
    def createTileFlyoutUpdaterForSecondaryTile_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("createTileFlyoutUpdaterForSecondaryTile")(x.asInstanceOf[js.Any])
    
    /* unmapped type */
    /* static member */
    @JSGlobal("Windows.UI.Notifications.TileFlyoutUpdateManager.getTemplateContent")
    @js.native
    def getTemplateContent: js.Any = js.native
    @scala.inline
    def getTemplateContent_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("getTemplateContent")(x.asInstanceOf[js.Any])
  }
  
  @JSGlobal("Windows.UI.Notifications.TileFlyoutUpdater")
  @js.native
  abstract class TileFlyoutUpdater ()
    extends typingsSlinky.winrtUwp.Windows.UI.Notifications.TileFlyoutUpdater
  
  /** Defines an update to a tile, including its visuals, identification tag, and expiration time. */
  @JSGlobal("Windows.UI.Notifications.TileNotification")
  @js.native
  class TileNotification protected ()
    extends typingsSlinky.winrtUwp.Windows.UI.Notifications.TileNotification {
    /**
      * Creates and initializes a new instance of the TileNotification object for use with a TileUpdater .
      * @param content The object that provides the content for the tile notification.
      */
    def this(content: XmlDocument) = this()
  }
  
  /** Specifies the content template to use in a tile update. For a more detailed discussion of each tile, including an example of its XML coding, specifics on each template's image sizes, and use with different versions of the tile XML schema, see The tile template catalog. */
  @JSGlobal("Windows.UI.Notifications.TileTemplateType")
  @js.native
  object TileTemplateType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.winrtUwp.Windows.UI.Notifications.TileTemplateType with Double] = js.native
    
    /* 47 */ val tileSquare150x150Block: typingsSlinky.winrtUwp.Windows.UI.Notifications.TileTemplateType.tileSquare150x150Block with Double = js.native
    
    /* 122 */ val tileSquare150x150IconWithBadge: typingsSlinky.winrtUwp.Windows.UI.Notifications.TileTemplateType.tileSquare150x150IconWithBadge with Double = js.native
    
    /* 46 */ val tileSquare150x150Image: typingsSlinky.winrtUwp.Windows.UI.Notifications.TileTemplateType.tileSquare150x150Image with Double = js.native
    
    /* 52 */ val tileSquare150x150PeekImageAndText01: typingsSlinky.winrtUwp.Windows.UI.Notifications.TileTemplateType.tileSquare150x150PeekImageAndText01 with Double = js.native
    
    /* 53 */ val tileSquare150x150PeekImageAndText02: typingsSlinky.winrtUwp.Windows.UI.Notifications.TileTemplateType.tileSquare150x150PeekImageAndText02 with Double = js.native
    
    /* 54 */ val tileSquare150x150PeekImageAndText03: typingsSlinky.winrtUwp.Windows.UI.Notifications.TileTemplateType.tileSquare150x150PeekImageAndText03 with Double = js.native
    
    /* 55 */ val tileSquare150x150PeekImageAndText04: typingsSlinky.winrtUwp.Windows.UI.Notifications.TileTemplateType.tileSquare150x150PeekImageAndText04 with Double = js.native
    
    /* 48 */ val tileSquare150x150Text01: typingsSlinky.winrtUwp.Windows.UI.Notifications.TileTemplateType.tileSquare150x150Text01 with Double = js.native
    
    /* 49 */ val tileSquare150x150Text02: typingsSlinky.winrtUwp.Windows.UI.Notifications.TileTemplateType.tileSquare150x150Text02 with Double = js.native
    
    /* 50 */ val tileSquare150x150Text03: typingsSlinky.winrtUwp.Windows.UI.Notifications.TileTemplateType.tileSquare150x150Text03 with Double = js.native
    
    /* 51 */ val tileSquare150x150Text04: typingsSlinky.winrtUwp.Windows.UI.Notifications.TileTemplateType.tileSquare150x150Text04 with Double = js.native
    
    /* 92 */ val tileSquare310x310BlockAndText01: typingsSlinky.winrtUwp.Windows.UI.Notifications.TileTemplateType.tileSquare310x310BlockAndText01 with Double = js.native
    
    /* 93 */ val tileSquare310x310BlockAndText02: typingsSlinky.winrtUwp.Windows.UI.Notifications.TileTemplateType.tileSquare310x310BlockAndText02 with Double = js.native
    
    /* 94 */ val tileSquare310x310Image: typingsSlinky.winrtUwp.Windows.UI.Notifications.TileTemplateType.tileSquare310x310Image with Double = js.native
    
    /* 95 */ val tileSquare310x310ImageAndText01: typingsSlinky.winrtUwp.Windows.UI.Notifications.TileTemplateType.tileSquare310x310ImageAndText01 with Double = js.native
    
    /* 96 */ val tileSquare310x310ImageAndText02: typingsSlinky.winrtUwp.Windows.UI.Notifications.TileTemplateType.tileSquare310x310ImageAndText02 with Double = js.native
    
    /* 97 */ val tileSquare310x310ImageAndTextOverlay01: typingsSlinky.winrtUwp.Windows.UI.Notifications.TileTemplateType.tileSquare310x310ImageAndTextOverlay01 with Double = js.native
    
    /* 98 */ val tileSquare310x310ImageAndTextOverlay02: typingsSlinky.winrtUwp.Windows.UI.Notifications.TileTemplateType.tileSquare310x310ImageAndTextOverlay02 with Double = js.native
    
    /* 99 */ val tileSquare310x310ImageAndTextOverlay03: typingsSlinky.winrtUwp.Windows.UI.Notifications.TileTemplateType.tileSquare310x310ImageAndTextOverlay03 with Double = js.native
    
    /* 102 */ val tileSquare310x310ImageCollection: typingsSlinky.winrtUwp.Windows.UI.Notifications.TileTemplateType.tileSquare310x310ImageCollection with Double = js.native
    
    /* 100 */ val tileSquare310x310ImageCollectionAndText01: typingsSlinky.winrtUwp.Windows.UI.Notifications.TileTemplateType.tileSquare310x310ImageCollectionAndText01 with Double = js.native
    
    /* 101 */ val tileSquare310x310ImageCollectionAndText02: typingsSlinky.winrtUwp.Windows.UI.Notifications.TileTemplateType.tileSquare310x310ImageCollectionAndText02 with Double = js.native
    
    /* 118 */ val tileSquare310x310SmallImageAndText01: typingsSlinky.winrtUwp.Windows.UI.Notifications.TileTemplateType.tileSquare310x310SmallImageAndText01 with Double = js.native
    
    /* 103 */ val tileSquare310x310SmallImagesAndTextList01: typingsSlinky.winrtUwp.Windows.UI.Notifications.TileTemplateType.tileSquare310x310SmallImagesAndTextList01 with Double = js.native
    
    /* 104 */ val tileSquare310x310SmallImagesAndTextList02: typingsSlinky.winrtUwp.Windows.UI.Notifications.TileTemplateType.tileSquare310x310SmallImagesAndTextList02 with Double = js.native
    
    /* 105 */ val tileSquare310x310SmallImagesAndTextList03: typingsSlinky.winrtUwp.Windows.UI.Notifications.TileTemplateType.tileSquare310x310SmallImagesAndTextList03 with Double = js.native
    
    /* 106 */ val tileSquare310x310SmallImagesAndTextList04: typingsSlinky.winrtUwp.Windows.UI.Notifications.TileTemplateType.tileSquare310x310SmallImagesAndTextList04 with Double = js.native
    
    /* 119 */ val tileSquare310x310SmallImagesAndTextList05: typingsSlinky.winrtUwp.Windows.UI.Notifications.TileTemplateType.tileSquare310x310SmallImagesAndTextList05 with Double = js.native
    
    /* 107 */ val tileSquare310x310Text01: typingsSlinky.winrtUwp.Windows.UI.Notifications.TileTemplateType.tileSquare310x310Text01 with Double = js.native
    
    /* 108 */ val tileSquare310x310Text02: typingsSlinky.winrtUwp.Windows.UI.Notifications.TileTemplateType.tileSquare310x310Text02 with Double = js.native
    
    /* 109 */ val tileSquare310x310Text03: typingsSlinky.winrtUwp.Windows.UI.Notifications.TileTemplateType.tileSquare310x310Text03 with Double = js.native
    
    /* 110 */ val tileSquare310x310Text04: typingsSlinky.winrtUwp.Windows.UI.Notifications.TileTemplateType.tileSquare310x310Text04 with Double = js.native
    
    /* 111 */ val tileSquare310x310Text05: typingsSlinky.winrtUwp.Windows.UI.Notifications.TileTemplateType.tileSquare310x310Text05 with Double = js.native
    
    /* 112 */ val tileSquare310x310Text06: typingsSlinky.winrtUwp.Windows.UI.Notifications.TileTemplateType.tileSquare310x310Text06 with Double = js.native
    
    /* 113 */ val tileSquare310x310Text07: typingsSlinky.winrtUwp.Windows.UI.Notifications.TileTemplateType.tileSquare310x310Text07 with Double = js.native
    
    /* 114 */ val tileSquare310x310Text08: typingsSlinky.winrtUwp.Windows.UI.Notifications.TileTemplateType.tileSquare310x310Text08 with Double = js.native
    
    /* 120 */ val tileSquare310x310Text09: typingsSlinky.winrtUwp.Windows.UI.Notifications.TileTemplateType.tileSquare310x310Text09 with Double = js.native
    
    /* 115 */ val tileSquare310x310TextList01: typingsSlinky.winrtUwp.Windows.UI.Notifications.TileTemplateType.tileSquare310x310TextList01 with Double = js.native
    
    /* 116 */ val tileSquare310x310TextList02: typingsSlinky.winrtUwp.Windows.UI.Notifications.TileTemplateType.tileSquare310x310TextList02 with Double = js.native
    
    /* 117 */ val tileSquare310x310TextList03: typingsSlinky.winrtUwp.Windows.UI.Notifications.TileTemplateType.tileSquare310x310TextList03 with Double = js.native
    
    /* 121 */ val tileSquare71x71IconWithBadge: typingsSlinky.winrtUwp.Windows.UI.Notifications.TileTemplateType.tileSquare71x71IconWithBadge with Double = js.native
    
    /* 124 */ val tileSquare71x71Image: typingsSlinky.winrtUwp.Windows.UI.Notifications.TileTemplateType.tileSquare71x71Image with Double = js.native
    
    /* 1 */ val tileSquareBlock: typingsSlinky.winrtUwp.Windows.UI.Notifications.TileTemplateType.tileSquareBlock with Double = js.native
    
    /* 0 */ val tileSquareImage: typingsSlinky.winrtUwp.Windows.UI.Notifications.TileTemplateType.tileSquareImage with Double = js.native
    
    /* 6 */ val tileSquarePeekImageAndText01: typingsSlinky.winrtUwp.Windows.UI.Notifications.TileTemplateType.tileSquarePeekImageAndText01 with Double = js.native
    
    /* 7 */ val tileSquarePeekImageAndText02: typingsSlinky.winrtUwp.Windows.UI.Notifications.TileTemplateType.tileSquarePeekImageAndText02 with Double = js.native
    
    /* 8 */ val tileSquarePeekImageAndText03: typingsSlinky.winrtUwp.Windows.UI.Notifications.TileTemplateType.tileSquarePeekImageAndText03 with Double = js.native
    
    /* 9 */ val tileSquarePeekImageAndText04: typingsSlinky.winrtUwp.Windows.UI.Notifications.TileTemplateType.tileSquarePeekImageAndText04 with Double = js.native
    
    /* 2 */ val tileSquareText01: typingsSlinky.winrtUwp.Windows.UI.Notifications.TileTemplateType.tileSquareText01 with Double = js.native
    
    /* 3 */ val tileSquareText02: typingsSlinky.winrtUwp.Windows.UI.Notifications.TileTemplateType.tileSquareText02 with Double = js.native
    
    /* 4 */ val tileSquareText03: typingsSlinky.winrtUwp.Windows.UI.Notifications.TileTemplateType.tileSquareText03 with Double = js.native
    
    /* 5 */ val tileSquareText04: typingsSlinky.winrtUwp.Windows.UI.Notifications.TileTemplateType.tileSquareText04 with Double = js.native
    
    /* 125 */ val tileTall150x310Image: typingsSlinky.winrtUwp.Windows.UI.Notifications.TileTemplateType.tileTall150x310Image with Double = js.native
    
    /* 60 */ val tileWide310x150BlockAndText01: typingsSlinky.winrtUwp.Windows.UI.Notifications.TileTemplateType.tileWide310x150BlockAndText01 with Double = js.native
    
    /* 61 */ val tileWide310x150BlockAndText02: typingsSlinky.winrtUwp.Windows.UI.Notifications.TileTemplateType.tileWide310x150BlockAndText02 with Double = js.native
    
    /* 123 */ val tileWide310x150IconWithBadgeAndText: typingsSlinky.winrtUwp.Windows.UI.Notifications.TileTemplateType.tileWide310x150IconWithBadgeAndText with Double = js.native
    
    /* 56 */ val tileWide310x150Image: typingsSlinky.winrtUwp.Windows.UI.Notifications.TileTemplateType.tileWide310x150Image with Double = js.native
    
    /* 58 */ val tileWide310x150ImageAndText01: typingsSlinky.winrtUwp.Windows.UI.Notifications.TileTemplateType.tileWide310x150ImageAndText01 with Double = js.native
    
    /* 59 */ val tileWide310x150ImageAndText02: typingsSlinky.winrtUwp.Windows.UI.Notifications.TileTemplateType.tileWide310x150ImageAndText02 with Double = js.native
    
    /* 57 */ val tileWide310x150ImageCollection: typingsSlinky.winrtUwp.Windows.UI.Notifications.TileTemplateType.tileWide310x150ImageCollection with Double = js.native
    
    /* 70 */ val tileWide310x150PeekImage01: typingsSlinky.winrtUwp.Windows.UI.Notifications.TileTemplateType.tileWide310x150PeekImage01 with Double = js.native
    
    /* 71 */ val tileWide310x150PeekImage02: typingsSlinky.winrtUwp.Windows.UI.Notifications.TileTemplateType.tileWide310x150PeekImage02 with Double = js.native
    
    /* 72 */ val tileWide310x150PeekImage03: typingsSlinky.winrtUwp.Windows.UI.Notifications.TileTemplateType.tileWide310x150PeekImage03 with Double = js.native
    
    /* 73 */ val tileWide310x150PeekImage04: typingsSlinky.winrtUwp.Windows.UI.Notifications.TileTemplateType.tileWide310x150PeekImage04 with Double = js.native
    
    /* 74 */ val tileWide310x150PeekImage05: typingsSlinky.winrtUwp.Windows.UI.Notifications.TileTemplateType.tileWide310x150PeekImage05 with Double = js.native
    
    /* 75 */ val tileWide310x150PeekImage06: typingsSlinky.winrtUwp.Windows.UI.Notifications.TileTemplateType.tileWide310x150PeekImage06 with Double = js.native
    
    /* 68 */ val tileWide310x150PeekImageAndText01: typingsSlinky.winrtUwp.Windows.UI.Notifications.TileTemplateType.tileWide310x150PeekImageAndText01 with Double = js.native
    
    /* 69 */ val tileWide310x150PeekImageAndText02: typingsSlinky.winrtUwp.Windows.UI.Notifications.TileTemplateType.tileWide310x150PeekImageAndText02 with Double = js.native
    
    /* 62 */ val tileWide310x150PeekImageCollection01: typingsSlinky.winrtUwp.Windows.UI.Notifications.TileTemplateType.tileWide310x150PeekImageCollection01 with Double = js.native
    
    /* 63 */ val tileWide310x150PeekImageCollection02: typingsSlinky.winrtUwp.Windows.UI.Notifications.TileTemplateType.tileWide310x150PeekImageCollection02 with Double = js.native
    
    /* 64 */ val tileWide310x150PeekImageCollection03: typingsSlinky.winrtUwp.Windows.UI.Notifications.TileTemplateType.tileWide310x150PeekImageCollection03 with Double = js.native
    
    /* 65 */ val tileWide310x150PeekImageCollection04: typingsSlinky.winrtUwp.Windows.UI.Notifications.TileTemplateType.tileWide310x150PeekImageCollection04 with Double = js.native
    
    /* 66 */ val tileWide310x150PeekImageCollection05: typingsSlinky.winrtUwp.Windows.UI.Notifications.TileTemplateType.tileWide310x150PeekImageCollection05 with Double = js.native
    
    /* 67 */ val tileWide310x150PeekImageCollection06: typingsSlinky.winrtUwp.Windows.UI.Notifications.TileTemplateType.tileWide310x150PeekImageCollection06 with Double = js.native
    
    /* 76 */ val tileWide310x150SmallImageAndText01: typingsSlinky.winrtUwp.Windows.UI.Notifications.TileTemplateType.tileWide310x150SmallImageAndText01 with Double = js.native
    
    /* 77 */ val tileWide310x150SmallImageAndText02: typingsSlinky.winrtUwp.Windows.UI.Notifications.TileTemplateType.tileWide310x150SmallImageAndText02 with Double = js.native
    
    /* 78 */ val tileWide310x150SmallImageAndText03: typingsSlinky.winrtUwp.Windows.UI.Notifications.TileTemplateType.tileWide310x150SmallImageAndText03 with Double = js.native
    
    /* 79 */ val tileWide310x150SmallImageAndText04: typingsSlinky.winrtUwp.Windows.UI.Notifications.TileTemplateType.tileWide310x150SmallImageAndText04 with Double = js.native
    
    /* 80 */ val tileWide310x150SmallImageAndText05: typingsSlinky.winrtUwp.Windows.UI.Notifications.TileTemplateType.tileWide310x150SmallImageAndText05 with Double = js.native
    
    /* 81 */ val tileWide310x150Text01: typingsSlinky.winrtUwp.Windows.UI.Notifications.TileTemplateType.tileWide310x150Text01 with Double = js.native
    
    /* 82 */ val tileWide310x150Text02: typingsSlinky.winrtUwp.Windows.UI.Notifications.TileTemplateType.tileWide310x150Text02 with Double = js.native
    
    /* 83 */ val tileWide310x150Text03: typingsSlinky.winrtUwp.Windows.UI.Notifications.TileTemplateType.tileWide310x150Text03 with Double = js.native
    
    /* 84 */ val tileWide310x150Text04: typingsSlinky.winrtUwp.Windows.UI.Notifications.TileTemplateType.tileWide310x150Text04 with Double = js.native
    
    /* 85 */ val tileWide310x150Text05: typingsSlinky.winrtUwp.Windows.UI.Notifications.TileTemplateType.tileWide310x150Text05 with Double = js.native
    
    /* 86 */ val tileWide310x150Text06: typingsSlinky.winrtUwp.Windows.UI.Notifications.TileTemplateType.tileWide310x150Text06 with Double = js.native
    
    /* 87 */ val tileWide310x150Text07: typingsSlinky.winrtUwp.Windows.UI.Notifications.TileTemplateType.tileWide310x150Text07 with Double = js.native
    
    /* 88 */ val tileWide310x150Text08: typingsSlinky.winrtUwp.Windows.UI.Notifications.TileTemplateType.tileWide310x150Text08 with Double = js.native
    
    /* 89 */ val tileWide310x150Text09: typingsSlinky.winrtUwp.Windows.UI.Notifications.TileTemplateType.tileWide310x150Text09 with Double = js.native
    
    /* 90 */ val tileWide310x150Text10: typingsSlinky.winrtUwp.Windows.UI.Notifications.TileTemplateType.tileWide310x150Text10 with Double = js.native
    
    /* 91 */ val tileWide310x150Text11: typingsSlinky.winrtUwp.Windows.UI.Notifications.TileTemplateType.tileWide310x150Text11 with Double = js.native
    
    /* 14 */ val tileWideBlockAndText01: typingsSlinky.winrtUwp.Windows.UI.Notifications.TileTemplateType.tileWideBlockAndText01 with Double = js.native
    
    /* 15 */ val tileWideBlockAndText02: typingsSlinky.winrtUwp.Windows.UI.Notifications.TileTemplateType.tileWideBlockAndText02 with Double = js.native
    
    /* 10 */ val tileWideImage: typingsSlinky.winrtUwp.Windows.UI.Notifications.TileTemplateType.tileWideImage with Double = js.native
    
    /* 12 */ val tileWideImageAndText01: typingsSlinky.winrtUwp.Windows.UI.Notifications.TileTemplateType.tileWideImageAndText01 with Double = js.native
    
    /* 13 */ val tileWideImageAndText02: typingsSlinky.winrtUwp.Windows.UI.Notifications.TileTemplateType.tileWideImageAndText02 with Double = js.native
    
    /* 11 */ val tileWideImageCollection: typingsSlinky.winrtUwp.Windows.UI.Notifications.TileTemplateType.tileWideImageCollection with Double = js.native
    
    /* 24 */ val tileWidePeekImage01: typingsSlinky.winrtUwp.Windows.UI.Notifications.TileTemplateType.tileWidePeekImage01 with Double = js.native
    
    /* 25 */ val tileWidePeekImage02: typingsSlinky.winrtUwp.Windows.UI.Notifications.TileTemplateType.tileWidePeekImage02 with Double = js.native
    
    /* 26 */ val tileWidePeekImage03: typingsSlinky.winrtUwp.Windows.UI.Notifications.TileTemplateType.tileWidePeekImage03 with Double = js.native
    
    /* 27 */ val tileWidePeekImage04: typingsSlinky.winrtUwp.Windows.UI.Notifications.TileTemplateType.tileWidePeekImage04 with Double = js.native
    
    /* 28 */ val tileWidePeekImage05: typingsSlinky.winrtUwp.Windows.UI.Notifications.TileTemplateType.tileWidePeekImage05 with Double = js.native
    
    /* 29 */ val tileWidePeekImage06: typingsSlinky.winrtUwp.Windows.UI.Notifications.TileTemplateType.tileWidePeekImage06 with Double = js.native
    
    /* 22 */ val tileWidePeekImageAndText01: typingsSlinky.winrtUwp.Windows.UI.Notifications.TileTemplateType.tileWidePeekImageAndText01 with Double = js.native
    
    /* 23 */ val tileWidePeekImageAndText02: typingsSlinky.winrtUwp.Windows.UI.Notifications.TileTemplateType.tileWidePeekImageAndText02 with Double = js.native
    
    /* 16 */ val tileWidePeekImageCollection01: typingsSlinky.winrtUwp.Windows.UI.Notifications.TileTemplateType.tileWidePeekImageCollection01 with Double = js.native
    
    /* 17 */ val tileWidePeekImageCollection02: typingsSlinky.winrtUwp.Windows.UI.Notifications.TileTemplateType.tileWidePeekImageCollection02 with Double = js.native
    
    /* 18 */ val tileWidePeekImageCollection03: typingsSlinky.winrtUwp.Windows.UI.Notifications.TileTemplateType.tileWidePeekImageCollection03 with Double = js.native
    
    /* 19 */ val tileWidePeekImageCollection04: typingsSlinky.winrtUwp.Windows.UI.Notifications.TileTemplateType.tileWidePeekImageCollection04 with Double = js.native
    
    /* 20 */ val tileWidePeekImageCollection05: typingsSlinky.winrtUwp.Windows.UI.Notifications.TileTemplateType.tileWidePeekImageCollection05 with Double = js.native
    
    /* 21 */ val tileWidePeekImageCollection06: typingsSlinky.winrtUwp.Windows.UI.Notifications.TileTemplateType.tileWidePeekImageCollection06 with Double = js.native
    
    /* 30 */ val tileWideSmallImageAndText01: typingsSlinky.winrtUwp.Windows.UI.Notifications.TileTemplateType.tileWideSmallImageAndText01 with Double = js.native
    
    /* 31 */ val tileWideSmallImageAndText02: typingsSlinky.winrtUwp.Windows.UI.Notifications.TileTemplateType.tileWideSmallImageAndText02 with Double = js.native
    
    /* 32 */ val tileWideSmallImageAndText03: typingsSlinky.winrtUwp.Windows.UI.Notifications.TileTemplateType.tileWideSmallImageAndText03 with Double = js.native
    
    /* 33 */ val tileWideSmallImageAndText04: typingsSlinky.winrtUwp.Windows.UI.Notifications.TileTemplateType.tileWideSmallImageAndText04 with Double = js.native
    
    /* 34 */ val tileWideSmallImageAndText05: typingsSlinky.winrtUwp.Windows.UI.Notifications.TileTemplateType.tileWideSmallImageAndText05 with Double = js.native
    
    /* 35 */ val tileWideText01: typingsSlinky.winrtUwp.Windows.UI.Notifications.TileTemplateType.tileWideText01 with Double = js.native
    
    /* 36 */ val tileWideText02: typingsSlinky.winrtUwp.Windows.UI.Notifications.TileTemplateType.tileWideText02 with Double = js.native
    
    /* 37 */ val tileWideText03: typingsSlinky.winrtUwp.Windows.UI.Notifications.TileTemplateType.tileWideText03 with Double = js.native
    
    /* 38 */ val tileWideText04: typingsSlinky.winrtUwp.Windows.UI.Notifications.TileTemplateType.tileWideText04 with Double = js.native
    
    /* 39 */ val tileWideText05: typingsSlinky.winrtUwp.Windows.UI.Notifications.TileTemplateType.tileWideText05 with Double = js.native
    
    /* 40 */ val tileWideText06: typingsSlinky.winrtUwp.Windows.UI.Notifications.TileTemplateType.tileWideText06 with Double = js.native
    
    /* 41 */ val tileWideText07: typingsSlinky.winrtUwp.Windows.UI.Notifications.TileTemplateType.tileWideText07 with Double = js.native
    
    /* 42 */ val tileWideText08: typingsSlinky.winrtUwp.Windows.UI.Notifications.TileTemplateType.tileWideText08 with Double = js.native
    
    /* 43 */ val tileWideText09: typingsSlinky.winrtUwp.Windows.UI.Notifications.TileTemplateType.tileWideText09 with Double = js.native
    
    /* 44 */ val tileWideText10: typingsSlinky.winrtUwp.Windows.UI.Notifications.TileTemplateType.tileWideText10 with Double = js.native
    
    /* 45 */ val tileWideText11: typingsSlinky.winrtUwp.Windows.UI.Notifications.TileTemplateType.tileWideText11 with Double = js.native
  }
  
  /** Creates TileUpdater objects used to change and update Start menu tiles. This class also provides access to the XML content of the system-provided tile templates so that you can customize that content for use in updating your tiles. */
  @JSGlobal("Windows.UI.Notifications.TileUpdateManager")
  @js.native
  abstract class TileUpdateManager ()
    extends typingsSlinky.winrtUwp.Windows.UI.Notifications.TileUpdateManager
  object TileUpdateManager {
    
    /**
      * Creates and initializes a new instance of the TileUpdater , which lets you change the appearance of the calling app's tile.
      * @return The object you will use to send changes to the app's tile.
      */
    /* static member */
    @JSGlobal("Windows.UI.Notifications.TileUpdateManager.createTileUpdaterForApplication")
    @js.native
    def createTileUpdaterForApplication(): typingsSlinky.winrtUwp.Windows.UI.Notifications.TileUpdater = js.native
    /**
      * Creates and initializes a new instance of the TileUpdater for a tile that belongs to another app in the same package as the calling app. The TileUpdater lets a developer change the appearance of that tile.
      * @param applicationId The Package Relative Application ID (PRAID) of the tile.
      * @return The object you will use to send changes to the tile identified by applicationId.
      */
    /* static member */
    @JSGlobal("Windows.UI.Notifications.TileUpdateManager.createTileUpdaterForApplication")
    @js.native
    def createTileUpdaterForApplication(applicationId: String): typingsSlinky.winrtUwp.Windows.UI.Notifications.TileUpdater = js.native
    
    /**
      * Creates and initializes a new instance of the TileUpdater , which enables you to change the appearance of a secondary tile . The tile can belong to the calling app or any other app in the same package.
      * @param tileId A unique ID for the tile.
      * @return The object you will use to send updates to the tile identified by tileID.
      */
    /* static member */
    @JSGlobal("Windows.UI.Notifications.TileUpdateManager.createTileUpdaterForSecondaryTile")
    @js.native
    def createTileUpdaterForSecondaryTile(tileId: String): typingsSlinky.winrtUwp.Windows.UI.Notifications.TileUpdater = js.native
    
    /**
      * Gets the XML content of one of the predefined tile templates so that you can customize it for a tile update.
      * @param type The name of the template.
      * @return The object that contains the XML.
      */
    /* static member */
    @JSGlobal("Windows.UI.Notifications.TileUpdateManager.getTemplateContent")
    @js.native
    def getTemplateContent(`type`: TileTemplateType): XmlDocument = js.native
  }
  
  /** Changes the content of the specific tile that the updater is bound to. */
  @JSGlobal("Windows.UI.Notifications.TileUpdater")
  @js.native
  abstract class TileUpdater ()
    extends typingsSlinky.winrtUwp.Windows.UI.Notifications.TileUpdater
  
  /** Exposes a method that retrieves the arguments associated with a toast action initiated by the user. This lets the app tell which action was taken when multiple actions were exposed. */
  @JSGlobal("Windows.UI.Notifications.ToastActivatedEventArgs")
  @js.native
  abstract class ToastActivatedEventArgs ()
    extends typingsSlinky.winrtUwp.Windows.UI.Notifications.ToastActivatedEventArgs
  
  /** Specifies the reason that a toast notification is no longer being shown. Used with ToastDismissedEventArgs.Reason . */
  @JSGlobal("Windows.UI.Notifications.ToastDismissalReason")
  @js.native
  object ToastDismissalReason extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.winrtUwp.Windows.UI.Notifications.ToastDismissalReason with Double] = js.native
    
    /* 1 */ val applicationHidden: typingsSlinky.winrtUwp.Windows.UI.Notifications.ToastDismissalReason.applicationHidden with Double = js.native
    
    /* 2 */ val timedOut: typingsSlinky.winrtUwp.Windows.UI.Notifications.ToastDismissalReason.timedOut with Double = js.native
    
    /* 0 */ val userCanceled: typingsSlinky.winrtUwp.Windows.UI.Notifications.ToastDismissalReason.userCanceled with Double = js.native
  }
  
  /** Provides the reason that a toast notification is no longer displayed on-screen. */
  @JSGlobal("Windows.UI.Notifications.ToastDismissedEventArgs")
  @js.native
  abstract class ToastDismissedEventArgs ()
    extends typingsSlinky.winrtUwp.Windows.UI.Notifications.ToastDismissedEventArgs
  
  /** Provides the error code that was generated in the process of raising a toast notification. */
  @JSGlobal("Windows.UI.Notifications.ToastFailedEventArgs")
  @js.native
  abstract class ToastFailedEventArgs ()
    extends typingsSlinky.winrtUwp.Windows.UI.Notifications.ToastFailedEventArgs
  
  /** Specifies the kind of change that has happened to a notification in toast history. Used with ToastNotificationHistoryChangedTriggerDetail.ChangeType . */
  @JSGlobal("Windows.UI.Notifications.ToastHistoryChangedType")
  @js.native
  object ToastHistoryChangedType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typingsSlinky.winrtUwp.Windows.UI.Notifications.ToastHistoryChangedType with Double
      ] = js.native
    
    /* 3 */ val added: typingsSlinky.winrtUwp.Windows.UI.Notifications.ToastHistoryChangedType.added with Double = js.native
    
    /* 0 */ val cleared: typingsSlinky.winrtUwp.Windows.UI.Notifications.ToastHistoryChangedType.cleared with Double = js.native
    
    /* 2 */ val expired: typingsSlinky.winrtUwp.Windows.UI.Notifications.ToastHistoryChangedType.expired with Double = js.native
    
    /* 1 */ val removed: typingsSlinky.winrtUwp.Windows.UI.Notifications.ToastHistoryChangedType.removed with Double = js.native
  }
  
  /** Defines the content, associated metadata and events, and expiration time of a toast notification. */
  @JSGlobal("Windows.UI.Notifications.ToastNotification")
  @js.native
  class ToastNotification protected ()
    extends typingsSlinky.winrtUwp.Windows.UI.Notifications.ToastNotification {
    /**
      * Creates and initializes a new instance of the ToastNotification .
      * @param content The XML content that defines the toast notification.
      */
    def this(content: XmlDocument) = this()
  }
  
  @JSGlobal("Windows.UI.Notifications.ToastNotificationActionTriggerDetail")
  @js.native
  abstract class ToastNotificationActionTriggerDetail ()
    extends typingsSlinky.winrtUwp.Windows.UI.Notifications.ToastNotificationActionTriggerDetail
  
  /** Manages the toast notifications for an app including the ability the clear all toast history and removing individual toasts. */
  @JSGlobal("Windows.UI.Notifications.ToastNotificationHistory")
  @js.native
  abstract class ToastNotificationHistory ()
    extends typingsSlinky.winrtUwp.Windows.UI.Notifications.ToastNotificationHistory
  
  /** Represents the details of a toast history changed trigger. */
  @JSGlobal("Windows.UI.Notifications.ToastNotificationHistoryChangedTriggerDetail")
  @js.native
  abstract class ToastNotificationHistoryChangedTriggerDetail ()
    extends typingsSlinky.winrtUwp.Windows.UI.Notifications.ToastNotificationHistoryChangedTriggerDetail
  
  /** Creates ToastNotifier objects that you use to raise toast notifications. This class also provides access to the XML content of the system-provided toast templates so that you can customize that content for use in your notifications. */
  @JSGlobal("Windows.UI.Notifications.ToastNotificationManager")
  @js.native
  abstract class ToastNotificationManager ()
    extends typingsSlinky.winrtUwp.Windows.UI.Notifications.ToastNotificationManager
  object ToastNotificationManager {
    
    @JSGlobal("Windows.UI.Notifications.ToastNotificationManager")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates and initializes a new instance of the ToastNotification , bound to the calling application, that lets you raise a toast notification to that app.
      * @return The object you will use to send the toast notification to the app.
      */
    /* static member */
    @JSGlobal("Windows.UI.Notifications.ToastNotificationManager.createToastNotifier")
    @js.native
    def createToastNotifier(): typingsSlinky.winrtUwp.Windows.UI.Notifications.ToastNotifier = js.native
    /**
      * Creates and initializes a new instance of the ToastNotification , bound to a specified app, usually another app in the same package.
      * @param applicationId The unique ID of the app.
      * @return The object you will use to send the toast notification to the tile.
      */
    /* static member */
    @JSGlobal("Windows.UI.Notifications.ToastNotificationManager.createToastNotifier")
    @js.native
    def createToastNotifier(applicationId: String): typingsSlinky.winrtUwp.Windows.UI.Notifications.ToastNotifier = js.native
    
    /**
      * Gets the XML content of one of the predefined toast templates so that you can customize it for use in your notification.
      * @param type One of the system-provided toast templates.
      * @return The object that contains the template XML.
      */
    /* static member */
    @JSGlobal("Windows.UI.Notifications.ToastNotificationManager.getTemplateContent")
    @js.native
    def getTemplateContent(`type`: ToastTemplateType): XmlDocument = js.native
    
    /** Gets the ToastNotificationHistory object. */
    /* static member */
    @JSGlobal("Windows.UI.Notifications.ToastNotificationManager.history")
    @js.native
    def history: typingsSlinky.winrtUwp.Windows.UI.Notifications.ToastNotificationHistory = js.native
    @scala.inline
    def history_=(x: typingsSlinky.winrtUwp.Windows.UI.Notifications.ToastNotificationHistory): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("history")(x.asInstanceOf[js.Any])
  }
  
  /** Raises a toast notification to the specific app to which the ToastNotifier is bound. This class also lets you schedule and remove toast notifications. */
  @JSGlobal("Windows.UI.Notifications.ToastNotifier")
  @js.native
  abstract class ToastNotifier ()
    extends typingsSlinky.winrtUwp.Windows.UI.Notifications.ToastNotifier
  
  /** Specifies the template to use in a toast notification. */
  @JSGlobal("Windows.UI.Notifications.ToastTemplateType")
  @js.native
  object ToastTemplateType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.winrtUwp.Windows.UI.Notifications.ToastTemplateType with Double] = js.native
    
    /* 0 */ val toastImageAndText01: typingsSlinky.winrtUwp.Windows.UI.Notifications.ToastTemplateType.toastImageAndText01 with Double = js.native
    
    /* 1 */ val toastImageAndText02: typingsSlinky.winrtUwp.Windows.UI.Notifications.ToastTemplateType.toastImageAndText02 with Double = js.native
    
    /* 2 */ val toastImageAndText03: typingsSlinky.winrtUwp.Windows.UI.Notifications.ToastTemplateType.toastImageAndText03 with Double = js.native
    
    /* 3 */ val toastImageAndText04: typingsSlinky.winrtUwp.Windows.UI.Notifications.ToastTemplateType.toastImageAndText04 with Double = js.native
    
    /* 4 */ val toastText01: typingsSlinky.winrtUwp.Windows.UI.Notifications.ToastTemplateType.toastText01 with Double = js.native
    
    /* 5 */ val toastText02: typingsSlinky.winrtUwp.Windows.UI.Notifications.ToastTemplateType.toastText02 with Double = js.native
    
    /* 6 */ val toastText03: typingsSlinky.winrtUwp.Windows.UI.Notifications.ToastTemplateType.toastText03 with Double = js.native
    
    /* 7 */ val toastText04: typingsSlinky.winrtUwp.Windows.UI.Notifications.ToastTemplateType.toastText04 with Double = js.native
  }
}
