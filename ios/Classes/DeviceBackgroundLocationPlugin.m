#import "DeviceBackgroundLocationPlugin.h"
#if __has_include(<device_background_location/device_background_location-Swift.h>)
#import <device_background_location/device_background_location-Swift.h>
#else
// Support project import fallback if the generated compatibility header
// is not copied when this plugin is created as a library.
// https://forums.swift.org/t/swift-static-libraries-dont-copy-generated-objective-c-header/19816
#import "device_background_location-Swift.h"
#endif

@implementation DeviceBackgroundLocationPlugin
+ (void)registerWithRegistrar:(NSObject<FlutterPluginRegistrar>*)registrar {
  [SwiftDeviceBackgroundLocationPlugin registerWithRegistrar:registrar];
}
@end
