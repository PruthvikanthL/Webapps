package com.app.management.repo;

import com.app.management.dto.AppDto;
import com.app.management.dto.AppOwner;
import com.app.management.dto.AppType;
import com.app.management.dto.AppVersion;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;

import java.util.List;

public class AppRepoImplementation implements AppRepo{

    @Override
    public List<AppDto> findall() {
        List<AppDto> list=new ArrayList<>();
        list.add(new AppDto("WhatsApp", AppType.MESSAGING, AppVersion.RELEASE, LocalDate.of(2023, 2, 10), 38.5, true, 0.0,Arrays.asList(new AppOwner("Meta Inc.", "support@meta.com"))));
        list.add(new AppDto("Instagram", AppType.SOCIAL_MEDIA,AppVersion.V4_0,LocalDate.of(2022,11,5),125.0,true,0.0,Arrays.asList(new AppOwner("Meta Inc","ig@meta.com"))));
        list.add(new AppDto("Facebook",AppType.SOCIAL_MEDIA,AppVersion.V4_0,LocalDate.of(2024,10,12),120,true,0.0,Arrays.asList(new AppOwner("Meta Inc","Facebookmeta@gmail.com"))));
        list.add(new AppDto("Spotify", AppType.MUSIC,AppVersion.V3_0,LocalDate.of(2023,9,12),98.0,true,4.99,Arrays.asList(new AppOwner("Daniel Ek","daniel@spotify.com"))));
        list.add(new AppDto("Zoom", AppType.COMMUNICATION, AppVersion.V2_0, LocalDate.of(2023, 6, 1), 55.0, true, 9.99,
                Arrays.asList(new AppOwner("Eric Yuan", "eric@zoom.us"))));

        list.add(new AppDto("Netflix", AppType.STREAMING, AppVersion.V4_0, LocalDate.of(2024, 1, 20), 102.3, false, 14.99,
                Arrays.asList(new AppOwner("Reed Hastings", "reed@netflix.com"))));

        list.add(new AppDto("Gmail", AppType.EMAIL, AppVersion.RELEASE, LocalDate.of(2023, 10, 5), 45.5, true, 0.0,
                Arrays.asList(new AppOwner("Google LLC", "gmail-support@google.com"))));

        list.add(new AppDto("Google Drive", AppType.PRODUCTIVITY, AppVersion.V3_0, LocalDate.of(2023, 3, 18), 92.1, true, 0.0,
                Arrays.asList(new AppOwner("Google LLC", "drive-support@google.com"))));

        list.add(new AppDto("Slack", AppType.TEAM_CHAT, AppVersion.V2_0, LocalDate.of(2023, 4, 9), 88.9, true, 6.67,
                Arrays.asList(new AppOwner("Stewart Butterfield", "support@slack.com"))));

        list.add(new AppDto("LinkedIn", AppType.PROFESSIONAL_NETWORK, AppVersion.RELEASE, LocalDate.of(2023, 8, 30), 70.0, true, 0.0,
                Arrays.asList(new AppOwner("Microsoft Corp.", "support@linkedin.com"))));

        list.add(new AppDto("YouTube", AppType.STREAMING, AppVersion.V4_0, LocalDate.of(2023, 12, 1), 150.0, true, 0.0,
                Arrays.asList(new AppOwner("Google LLC", "yt-support@google.com"))));

        list.add(new AppDto("Amazon", AppType.SHOPPING, AppVersion.V3_0, LocalDate.of(2023, 9, 1), 130.0, true, 0.0,
                Arrays.asList(new AppOwner("Amazon Inc.", "support@amazon.com"))));

        list.add(new AppDto("Flipkart", AppType.SHOPPING, AppVersion.V3_0, LocalDate.of(2023, 6, 21), 90.0, true, 0.0,
                Arrays.asList(new AppOwner("Binny Bansal", "binny@flipkart.com"), new AppOwner("Sachin Bansal", "sachin@flipkart.com"))));

        list.add(new AppDto("Trello", AppType.PROJECT_MANAGEMENT, AppVersion.V2_0, LocalDate.of(2023, 7, 1), 39.0, true, 0.0,
                Arrays.asList(new AppOwner("Atlassian", "trello@atlassian.com"))));

        list.add(new AppDto("Google Maps", AppType.NAVIGATION, AppVersion.V4_0, LocalDate.of(2023, 11, 19), 110.0, true, 0.0,
                Arrays.asList(new AppOwner("Google LLC", "maps-support@google.com"))));

        list.add(new AppDto("Canva", AppType.DESIGN, AppVersion.V3_0, LocalDate.of(2023, 10, 10), 75.0, true, 6.99,
                Arrays.asList(new AppOwner("Melanie Perkins", "mel@canva.com"))));

        list.add(new AppDto("Paytm", AppType.PAYMENTS, AppVersion.V2_0, LocalDate.of(2024, 1, 2), 48.5, true, 0.0,
                Arrays.asList(new AppOwner("Vijay Shekhar Sharma", "vijay@paytm.com"))));

        list.add(new AppDto("Telegram", AppType.MESSAGING, AppVersion.RELEASE, LocalDate.of(2023, 12, 24), 42.3, true, 0.0,
                Arrays.asList(new AppOwner("Pavel Durov", "pavel@telegram.org"))));

        list.add(new AppDto("Snapchat", AppType.SOCIAL_MEDIA, AppVersion.V3_0, LocalDate.of(2023, 7, 14), 85.0, true, 0.0,
                Arrays.asList(new AppOwner("Snap Inc.", "support@snapchat.com"))));

        list.add(new AppDto("Pinterest", AppType.LIFESTYLE, AppVersion.V2_0, LocalDate.of(2023, 5, 8), 70.3, true, 0.0,
                Arrays.asList(new AppOwner("Ben Silbermann", "ben@pinterest.com"))));

        list.add(new AppDto("PhonePe", AppType.FINANCE, AppVersion.RELEASE, LocalDate.of(2023, 6, 9), 49.9, true, 0.0,
                Arrays.asList(new AppOwner("PhonePe Pvt Ltd", "support@phonepe.com"))));

        list.add(new AppDto("Uber", AppType.TRANSPORT, AppVersion.V3_0, LocalDate.of(2023, 8, 9), 72.2, true, 0.0,
                Arrays.asList(new AppOwner("Uber Technologies", "support@uber.com"))));

        list.add(new AppDto("MX Player", AppType.MEDIA, AppVersion.RELEASE, LocalDate.of(2023, 11, 7), 92.4, true, 0.0,
                Arrays.asList(new AppOwner("MX Media", "support@mxplayer.in"))));

        list.add(new AppDto("Koo", AppType.SOCIAL_MEDIA, AppVersion.BETA, LocalDate.of(2023, 7, 30), 42.6, true, 0.0,
                Arrays.asList(new AppOwner("Koo App", "support@kooapp.com"))));

        list.add(new AppDto("Zomato", AppType.FOOD_DELIVERY, AppVersion.V2_0, LocalDate.of(2023, 7, 4), 65.7, true, 0.0,
                Arrays.asList(new AppOwner("Deepinder Goyal", "deepinder@zomato.com"))));

        list.add(new AppDto("Swiggy", AppType.FOOD_DELIVERY, AppVersion.V2_0, LocalDate.of(2023, 6, 30), 67.3, true, 0.0,
                Arrays.asList(new AppOwner("Sriharsha Majety", "sriharsha@swiggy.com"))));

        list.add(new AppDto("Google Photos", AppType.CLOUD_STORAGE, AppVersion.V3_0, LocalDate.of(2023, 10, 2), 89.6, true, 0.0,
                Arrays.asList(new AppOwner("Google LLC", "photos@google.com"))));

        list.add(new AppDto("Microsoft Word", AppType.PRODUCTIVITY, AppVersion.RELEASE, LocalDate.of(2023, 11, 1), 195.0, false, 7.99,
                Arrays.asList(new AppOwner("Microsoft Corp.", "support@office.com"))));

        list.add(new AppDto("Discord", AppType.VOICE_CHAT, AppVersion.V3_0, LocalDate.of(2023, 9, 25), 86.0, true, 0.0,
                Arrays.asList(new AppOwner("Jason Citron", "jason@discord.com"))));

        list.add(new AppDto("Coursera", AppType.EDUCATION, AppVersion.V3_0, LocalDate.of(2023, 12, 12), 120.5, true, 12.99,
                Arrays.asList(new AppOwner("Andrew Ng", "andrew@coursera.org"))));

        list.add(new AppDto("Duolingo", AppType.EDUCATION, AppVersion.V2_0, LocalDate.of(2023, 6, 18), 55.8, true, 0.0,
                Arrays.asList(new AppOwner("Luis von Ahn", "luis@duolingo.com"))));

        list.add(new AppDto("Google Fit", AppType.HEALTH, AppVersion.RELEASE, LocalDate.of(2023, 10, 3), 41.0, true, 0.0,
                Arrays.asList(new AppOwner("Google LLC", "fit-support@google.com"))));

        list.add(new AppDto("Google Photos", AppType.UTILITY, AppVersion.RELEASE, LocalDate.of(2024, 2, 14), 108.3, true, 0.0,
                Arrays.asList(new AppOwner("Google LLC", "photos-support@google.com"))));

        list.add(new AppDto("Google Lens",  AppType.UTILITY, AppVersion.ALPHA, LocalDate.of(2023, 3, 3), 45.1, true, 0.0,
                Arrays.asList(new AppOwner("Google LLC", "lens-support@google.com"))));

        list.add(new AppDto("ShareChat", AppType.SOCIAL_MEDIA, AppVersion.RELEASE, LocalDate.of(2023, 11, 13), 58.3, true, 0.0,
                Arrays.asList(new AppOwner("ShareChat", "help@sharechat.com"))));

        list.add(new AppDto("True Caller",  AppType.UTILITY, AppVersion.RELEASE, LocalDate.of(2023, 8, 23), 59.1, true, 0.0,
                Arrays.asList(new AppOwner("TrueCaller", "support@truecaller.com"))));

        list.add(new AppDto("Opera Browser", AppType.UTILITY, AppVersion.ALPHA, LocalDate.of(2022, 12, 10), 78.4, true, 0.0,
                Arrays.asList(new AppOwner("Opera Software", "help@opera.com"))));

        list.add(new AppDto("SkillShare",  AppType.UTILITY, AppVersion.BETA, LocalDate.of(2023, 11, 25), 96.3, false, 15.99,
                Arrays.asList(new AppOwner("Skillshare", "support@skillshare.com"))));

        list.add(new AppDto("Hotstar", AppType.STREAMING, AppVersion.V4_0, LocalDate.of(2023, 12, 31), 110.2, true, 7.99,
                Arrays.asList(new AppOwner("Disney+ Hotstar", "support@hotstar.com"))));

        list.add(new AppDto("Reddit", AppType.SOCIAL_MEDIA, AppVersion.V3_0, LocalDate.of(2023, 5, 19), 80.3, true, 0.0,
                Arrays.asList(new AppOwner("Reddit Inc.", "admin@reddit.com"))));

        list.add(new AppDto("Threads", AppType.SOCIAL_MEDIA, AppVersion.V2_0, LocalDate.of(2023, 7, 7), 88.0, true, 0.0,
                Arrays.asList(new AppOwner("Meta Inc.", "support@threads.net"))));

        list.add(new AppDto("Steam", AppType.GAMING, AppVersion.V4_0, LocalDate.of(2024, 1, 15), 210.0, true, 0.0,
                Arrays.asList(new AppOwner("Valve Corp.", "support@steampowered.com"))));

        list.add(new AppDto("Twitch", AppType.STREAMING, AppVersion.V3_0, LocalDate.of(2023, 9, 22), 95.5, true, 0.0,
                Arrays.asList(new AppOwner("Amazon Inc.", "support@twitch.tv"))));

        list.add(new AppDto("Adobe Photoshop Express", AppType.DESIGN, AppVersion.V4_0, LocalDate.of(2023, 6, 30), 105.3, true, 0.0,
                Arrays.asList(new AppOwner("Adobe Inc.", "support@adobe.com"))));

        list.add(new AppDto("Khan Academy", AppType.EDUCATION, AppVersion.RELEASE, LocalDate.of(2023, 4, 17), 58.6, true, 0.0,
                Arrays.asList(new AppOwner("Khan Academy", "help@khanacademy.org"))));

        list.add(new AppDto("Myntra", AppType.SHOPPING, AppVersion.V3_0, LocalDate.of(2023, 10, 1), 78.4, true, 0.0,
                Arrays.asList(new AppOwner("Myntra Designs Pvt. Ltd.", "support@myntra.com"))));

        list.add(new AppDto("Google Pay", AppType.FINANCE, AppVersion.V3_0, LocalDate.of(2023, 12, 11), 70.2, true, 0.0,
                Arrays.asList(new AppOwner("Google LLC", "gpay-support@google.com"))));

        list.add(new AppDto("Ola", AppType.TRANSPORT, AppVersion.V2_0, LocalDate.of(2023, 9, 29), 73.5, true, 0.0,
                Arrays.asList(new AppOwner("ANI Technologies", "support@olacabs.com"))));

        list.add(new AppDto("Roblox", AppType.GAMING, AppVersion.V3_0, LocalDate.of(2023, 6, 18), 150.0, true, 0.0,
                Arrays.asList(new AppOwner("Roblox Corporation", "support@roblox.com"))));

        list.add(new AppDto("PUBG Mobile", AppType.GAMING, AppVersion.V4_0, LocalDate.of(2023, 7, 9), 190.3, true, 0.0,
                Arrays.asList(new AppOwner("Tencent Games", "support@pubgmobile.com"))));

        list.add(new AppDto("Notion", AppType.PRODUCTIVITY, AppVersion.V3_0, LocalDate.of(2023, 10, 22), 88.0, true, 0.0,
                Arrays.asList(new AppOwner("Notion Labs", "support@makenotion.com"))));

        list.add(new AppDto("Udemy", AppType.EDUCATION, AppVersion.V3_0, LocalDate.of(2023, 12, 5), 110.6, true, 11.99,
                Arrays.asList(new AppOwner("Udemy Inc.", "instructorsupport@udemy.com"))));

        list.add(new AppDto("Nykaa", AppType.SHOPPING, AppVersion.V2_0, LocalDate.of(2023, 8, 11), 63.0, true, 0.0,
                Arrays.asList(new AppOwner("FSN E-Commerce", "support@nykaa.com"))));

        list.add(new AppDto("Meesho", AppType.SHOPPING, AppVersion.V2_0, LocalDate.of(2023, 5, 17), 60.5, true, 0.0,
                Arrays.asList(new AppOwner("Meesho", "help@meesho.com"))));

        list.add(new AppDto("Cred", AppType.FINANCE, AppVersion.V3_0, LocalDate.of(2023, 9, 27), 58.8, true, 0.0,
                Arrays.asList(new AppOwner("Dreamplug Technologies", "support@cred.club"))));

        list.add(new AppDto("Rapido", AppType.TRANSPORT, AppVersion.V2_0, LocalDate.of(2023, 10, 14), 52.4, true, 0.0,
                Arrays.asList(new AppOwner("Rapido Bike Taxi", "support@rapido.bike"))));

        return list;
    }
}
