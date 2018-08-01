#import "CDVMyPlugin.h"

@implementation CDVMyPlugin

- (void)ping:(CDVInvokedUrlCommand*)command
{
    CDVPluginResult* pluginResult = [CDVPluginResult resultWithStatus:CDVCommandStatus_OK messageAsString:@"echo"];

    [self.commandDelegate sendPluginResult:pluginResult callbackId:command.callbackId];
}

@end
